account包
==
##1.获取换入换出积分列表

找用户绑定商户的信息：
根据用户查询积分钱包和积分字典，构建元组

根据exCode构建不属于该exCode的数据类型

找积分换代币的合约：
查询合约信息表，合约类型为积分换代币，作为主合约

loop所有不属于该exCode的积分换代币且主品种外部结算，副品种内部结算的合约

查非excode积分余额：
根据excode和外部绑定uid发往apiserver向商户查询用户积分余额

商家token失效，删除pointwallet

计算非excode商户品种手续费率
非excode最低交易数量
非excode最高交易数量
主合约最新价/非excode合约最新价


WalletNew(
          w.wallet.asset,
          w.wallet.slaveAsset,
          w.wallet.availableBalance,	去商户查
          w.wallet.reservedBalance,
          w.wallet.bindTime,
          w.wallet.assetValue,
          mktSupply,	point_amount市场供应需求
          mktDemand,	point_amount市场供应需求
          minVal,		合约主品种最低交易数量
          maxVal,		合约主品种最高交易数量
          mFeeRatio,	合约主品种手续费
          exRatio		主合约最新价/合约最新价
        )


##2.获取推荐换入积分列表
pointdict商户表会配优先级


##3.领取卡券(有一个中间人的概念，就是master账户)
card_receive_statement_book 领用卡券流水表
判断是否已领

获取领券卡券的剩余数量:
卡券钱包cardWallet的积分余额 与 卡券列表明细cardList个数 的最小值 ？？？？？？？？？？？？？？？？？

领取:领券账户划账至用户账户
获取领用账户Cardwallet
master账户
LEFT JOIN account a on t.USERNAME = a.USERNAME
where a.ROLE = 5 and a.STATUS = 1 and t.ISDISPALY = '1'
更新CardWallet表master账户，剩余数量减少1，可用数量减少1
更新CardWallet表user账户，剩余数量增加1，可用数量增加1

##4.获取商家token
获取积分钱包pointWallet
根据externalUid外部绑定uid(手机号)，
手机号发往apiserver BalanceCtrl/token， 查询points_token_info


##5.登录兼注册
根据手机号查询account，
account没有认为是注册，有认为是登陆，给esper处理
查看账户关联是否存在unify_acct_mapping
统一账户校验


##6.绑定卡券
判断手机号是否是合法用户
查询brand_bind表，存在数据则已经绑定，不存在则插入数据，绑定成功


##7.根据已绑定品牌获取卡券列表
调用apiserver查询卡券余额外部接口调用


##8.获取用户可绑定的卡券列表
简单查表


##9.收货信息接口（摇一摇）
判断是否已参加活动account_receive_prize
判断是否有库存activity_prize，有库存写入流水


##10.上传用户头像
判断后缀名是否合法
用的io.minio组件，用处是把图片上传然后返回一个url，我们把url存库，然后通过url调用
地址写入account的AVATAR字段


basicinfo包
==
##1.获取商家
获取所有商户Brand


##2.获取热门卡券
按照热门hotOrder顺序查找Carddict


##3.获取卡券分类
查找card_category


##4.按分类获取买券卡券列表
joinCarddict和card_category_relation


##5.在领卷中心，按分类获取领券卡券列表
根据登录状态，获取领券卡券列表：
判断是否已被user绑定brand_bind，显示卡的绑定状态
按卡券领取的显示状态：
根据领券库存和卡列表库存判断是否有存量，根据流水判断是否已领取


##6.热门资讯
查询hot_information


##7.根据品牌获取卡券列表
根据商户品牌关联外键brandCode查询carddict


##8.获取某一个品类的卡券详情
查询carddict


##9.获取卡券信息详情
查询carddict


##10.获取开关信息
支付的开关


##11.获取首页banner信息
查询marking_activity_info
activitytype区分 活动入口：0首页banner，1首页弹窗，2活动消息，3热门资讯，4app首页

##12.获取首页弹窗弹窗广告信息
查询marking_activity_info
activitytype区分 活动入口：0首页banner，1首页弹窗，2活动消息，3热门资讯，4app首页


order包
==
##1.积分交易下单（frontoffice下单，到backoffice判断状态，到core）
查找换入换出积分的合约
查找对应唤出换入积分的合约
算出费率比率等，组成OrderGroupParamsV3
提交订单
生成唯一ID
验证订单有效性
推送kafka topic dams.exchange.point.inputOrder
-------------------------------------------------------------------------------
backoffice
backoffice接收kafka topic dams.exchange.point.inputOrder
接收到kafka消息写入message_history，保证幂等性
判断订单信息是否完整
判断订单账户余额，调用apiserver向商户查询余额，判断换出是否超过余额
转账：买1卖多
调用apiserver，卖出：去用户和中间账户转账，转出用户账户，转入中间账户
所有转账都成功，写入point_statement_book
存在转账失败，就要把之前转账成功的再转回去，即转出中间账户，转入用户账户，回转出错计入point_error_statement_book
转账：买多卖1，与上面处理卖出类似，不同点是卖出只有1张，不存在转账失败再回转成功部分的过程
-------------------------------------------------------------------------------
core
撮合

同时
ledger
订单状态SUBMIT, SUBMIT_FAILURE，写入积分订单组表point_order_group_history
订单状态SUBMIT_FAILURE，推送ios，android
-------------------------------------------------------------------------------
backoffice
针对撮合成功买入的交易，调用apiserver从商户中间账户转入买入用户，
转入成功写入point_statement_book，失败写入point_error_statement_book
-------------------------------------------------------------------------------
ledger
写入积分成交流水表point_trade_history
订单完成后需要进行剩余积分的供应量和需求量的处理：
根据积分订单组表point_order_group_history 和 积分订单表point_order_history更新积分品种成交量和供应量表POINT_AMOUNT
更新point_order_group_history
-------------------------------------------------------------------------------
backoffice
从中间账户恢复未成交：
判断订单组是否为终态，若为终态，从商户中间账户返还未成交的量（委托量-成交量）
转入成功写入point_statement_book，失败写入point_error_statement_book
已成交的处理费用：
手续费=总手续费*成交/委托，通过apiserver给商户接口缴纳手续费，
缴纳手续费失败，写入point_error_statement_book

##2. 积分交易撤单
查询point_order_group_history验证订单是否存在
发送kafka消息
--------------------------------------------------------------------------
backoffice
接收撤单消息，发送kafka消息
--------------------------------------------------------------------------
core
接收撤单消息，设置状态为撤单成功，发送kafka消息
--------------------------------------------------------------------------
backoffice
接收撤单成功消息，撤单积分结算
撤销量+商户手续费[（撤销数量/委托数量）* 商户手续费 向下取整] 通过apiserver从商户中间账户转出，失败写入point_error_statement_book

##3. 接收撤单成功消息，撤单积分结算


#question
撤单退还费用，是按比例退还，（撤销数量/委托数量）* 商户手续费 向下取整，这样全部撤销会有尾差吧？


