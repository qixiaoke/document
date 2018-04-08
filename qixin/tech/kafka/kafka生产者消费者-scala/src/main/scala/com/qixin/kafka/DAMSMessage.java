package com.qixin.kafka;

public final class DAMSMessage {

//    public static final class PBPointOrderGroup {
//
//        public static PBPointOrderGroup newBuilder() {
//            return new PBPointOrderGroup();
//        }
//
//        static ObjectMapper mapper = new ObjectMapper();
//
//        public static PBPointOrderGroup parseFrom(byte[] message) throws IOException {
//            return mapper.readValue(new String(message, "utf-8"), PBPointOrderGroup.class);
//        }
//
//        public byte[] toByteArray() throws IOException {
//            return mapper.writeValueAsString(this).getBytes("utf-8");
//        }
//
//        public enum PBOrderSide {
//            BUY(0), SELL(1);
//
//            private int value;
//            PBOrderSide(int value) {
//                this.value = value;
//            }
//
//            public int getValue() {
//                return value;
//            }
//        }
//
//        public enum OrderAction {
//            SUBMIT(0), CANCEL(1), TIMEOUT_CHECK(2), SUBMIT_FAILURE(3);
//            private int value;
//            OrderAction(int value) {
//                this.value = value;
//            }
//
//            public int getValue() {
//                return value;
//            }
//        }
//
//        @Override
//        public String toString() {
//            return "PBPointOrderGroup{" +
//                    "orderGroupId='" + orderGroupId + '\'' +
//                    ", exCode='" + exCode + '\'' +
//                    ", orderSide=" + orderSide +
//                    ", broker='" + broker + '\'' +
//                    ", quantity='" + quantity + '\'' +
//                    ", orderTime=" + orderTime +
//                    ", price='" + price + '\'' +
//                    ", merchantFeeRate='" + merchantFeeRate + '\'' +
//                    ", merchantFeeAmount='" + merchantFeeAmount + '\'' +
//                    ", action=" + action +
//                    ", IP='" + IP + '\'' +
//                    ", deviceInfo='" + deviceInfo + '\'' +
//                    ", pointOrderList=" + pointOrderList +
//                    '}';
//        }
//
//        // OrderGroup唯一标识符
//        private String orderGroupId;
//        // 品种编号（一对多订单一方向的品种编号）
//        private String exCode;
//        // 订单方向（0:买/1:卖）
//        PBOrderSide orderSide;
//        // 提交订单用户名
//        private String broker;
//        // 订单买卖数量
//        private String quantity;
//        // 订单提交时间
//        private long orderTime;
//        // 品种价格
//        private String price;
//        // 商户手续费率
//        private String merchantFeeRate;
//        // 商户手续费金额
//        private String merchantFeeAmount;
//        // 行动类型（0:提交订单/1:撤单/2:超时检查）
//        OrderAction action;
//        //IP
//        private String IP;
//        // 设备信息
//        private String deviceInfo;
//        // 订单集合
//        private List<PBPointOrder> pointOrderList = new ArrayList<>();
//
//        public String getOrderGroupId() {
//            return orderGroupId;
//        }
//
//        public void setOrderGroupId(String orderGroupId) {
//            this.orderGroupId = orderGroupId;
//        }
//
//        public String getExCode() {
//            return exCode;
//        }
//
//        public void setExCode(String exCode) {
//            this.exCode = exCode;
//        }
//
//        public PBOrderSide getOrderSide() {
//            return orderSide;
//        }
//
//        public void setOrderSide(PBOrderSide orderSide) {
//            this.orderSide = orderSide;
//        }
//
//        public String getBroker() {
//            return broker;
//        }
//
//        public void setBroker(String broker) {
//            this.broker = broker;
//        }
//
//        public String getQuantity() {
//            return quantity;
//        }
//
//        public void setQuantity(String quantity) {
//            this.quantity = quantity;
//        }
//
//        public long getOrderTime() {
//            return orderTime;
//        }
//
//        public void setOrderTime(long orderTime) {
//            this.orderTime = orderTime;
//        }
//
//        public String getPrice() {
//            return price;
//        }
//
//        public void setPrice(String price) {
//            this.price = price;
//        }
//
//        public String getMerchantFeeRate() {
//            return merchantFeeRate;
//        }
//
//        public void setMerchantFeeRate(String merchantFeeRate) {
//            this.merchantFeeRate = merchantFeeRate;
//        }
//
//        public String getMerchantFeeAmount() {
//            return merchantFeeAmount;
//        }
//
//        public void setMerchantFeeAmount(String merchantFeeAmount) {
//            this.merchantFeeAmount = merchantFeeAmount;
//        }
//
//        public OrderAction getAction() {
//            return action;
//        }
//
//        public void setAction(OrderAction action) {
//            this.action = action;
//        }
//
//        public String getIP() {
//            return IP;
//        }
//
//        public void setIP(String IP) {
//            this.IP = IP;
//        }
//
//        public String getDeviceInfo() {
//            return deviceInfo;
//        }
//
//        public void setDeviceInfo(String deviceInfo) {
//            this.deviceInfo = deviceInfo;
//        }
//
//        public List<PBPointOrder> getPointOrderList() {
//            return pointOrderList;
//        }
//
//        public void setPointOrderList(List<PBPointOrder> pointOrderList) {
//            this.pointOrderList = pointOrderList;
//        }
//    }
//
//    public static final class PBPointOrder {
//        public static PBPointOrder newBuilder() {
//            return new PBPointOrder();
//        }
//
//        static ObjectMapper mapper = new ObjectMapper();
//
//        public static PBPointOrder parseFrom(byte[] message) throws IOException {
//            return mapper.readValue(new String(message, "utf-8"), PBPointOrder.class);
//        }
//
//        public byte[] toByteArray() throws IOException {
//            return mapper.writeValueAsString(this).getBytes("utf-8");
//        }
//
//        @Override
//        public String toString() {
//            return "PBPointOrder{" +
//                    "orderId='" + orderId + '\'' +
//                    ", orderGroupId='" + orderGroupId + '\'' +
//                    ", exCode='" + exCode + '\'' +
//                    ", quantity='" + quantity + '\'' +
//                    ", rate='" + rate + '\'' +
//                    ", price='" + price + '\'' +
//                    ", merchantFeeRate='" + merchantFeeRate + '\'' +
//                    ", merchantFeeAmount='" + merchantFeeAmount + '\'' +
//                    '}';
//        }
//
//        // 订单号
//        private String orderId;
//        // 订单组编号
//        private String orderGroupId;
//        // 品种编号(一对多订单中多方向的品种编号)
//        private String exCode;
//        // 订单提交数量
//        private String quantity;
//        // 兑换率
//        private String rate;
//        // 品种价格
//        private String price;
//        // 商户手续费率
//        private String merchantFeeRate;
//        // 商户手续费金额
//        private String merchantFeeAmount;
//
//        public String getOrderId() {
//            return orderId;
//        }
//
//        public void setOrderId(String orderId) {
//            this.orderId = orderId;
//        }
//
//        public String getOrderGroupId() {
//            return orderGroupId;
//        }
//
//        public void setOrderGroupId(String orderGroupId) {
//            this.orderGroupId = orderGroupId;
//        }
//
//        public String getExCode() {
//            return exCode;
//        }
//
//        public void setExCode(String exCode) {
//            this.exCode = exCode;
//        }
//
//        public String getQuantity() {
//            return quantity;
//        }
//
//        public void setQuantity(String quantity) {
//            this.quantity = quantity;
//        }
//
//        public String getRate() {
//            return rate;
//        }
//
//        public void setRate(String rate) {
//            this.rate = rate;
//        }
//
//        public String getPrice() {
//            return price;
//        }
//
//        public void setPrice(String price) {
//            this.price = price;
//        }
//
//        public String getMerchantFeeRate() {
//            return merchantFeeRate;
//        }
//
//        public void setMerchantFeeRate(String merchantFeeRate) {
//            this.merchantFeeRate = merchantFeeRate;
//        }
//
//        public String getMerchantFeeAmount() {
//            return merchantFeeAmount;
//        }
//
//        public void setMerchantFeeAmount(String merchantFeeAmount) {
//            this.merchantFeeAmount = merchantFeeAmount;
//        }
//    }
//
//    public static final class PBPointTrade {
//        public static PBPointTrade newBuilder() {
//            return new PBPointTrade();
//        }
//
//        static ObjectMapper mapper = new ObjectMapper();
//
//        public static PBPointTrade parseFrom(byte[] message) throws IOException {
//            return mapper.readValue(new String(message, "utf-8"), PBPointTrade.class);
//        }
//
//        public byte[] toByteArray() throws IOException {
//            return mapper.writeValueAsString(this).getBytes("utf-8");
//        }
//
//        public enum PBTradeStatus {
//            // 结算成功,撤销订单,未知状态,错误
//            SUCCESS(0), CANCEL(1), UNKNOWN(2), ERROR(3);
//            private int value;
//            PBTradeStatus(int value) {
//                this.value = value;
//            }
//
//            public int getValue() {
//                return value;
//            }
//        }
//
//        @Override
//        public String toString() {
//            return "PBPointTrade{" +
//                    "tradeId='" + tradeId + '\'' +
//                    ", orderId='" + orderId + '\'' +
//                    ", orderGroupId='" + orderGroupId + '\'' +
//                    ", cycleId='" + cycleId + '\'' +
//                    ", broker='" + broker + '\'' +
//                    ", sellExCode='" + sellExCode + '\'' +
//                    ", sellExNum='" + sellExNum + '\'' +
//                    ", buyExCode='" + buyExCode + '\'' +
//                    ", buyExNum='" + buyExNum + '\'' +
//                    ", rate='" + rate + '\'' +
//                    ", tradeTime=" + tradeTime +
//                    ", tradeStatus=" + tradeStatus +
//                    ", IP='" + IP + '\'' +
//                    ", deviceInfo='" + deviceInfo + '\'' +
//                    ", sellExPrice='" + sellExPrice + '\'' +
//                    ", buyExPrice='" + buyExPrice + '\'' +
//                    '}';
//        }
//
//        // 交易唯一标识符
//        private String tradeId;
//        // 订单号
//        private String orderId;
//        // 订单组编号
//        private String orderGroupId;
//        // 撮合环编号
//        private String cycleId;
//        // 提交订单用户名
//        private String broker;
//        // 卖出积分品种编号
//        private String sellExCode;
//        // 卖出积分品种数量
//        private String sellExNum;
//        // 买入积分品种编号
//        private String buyExCode;
//        // 买入积分品种数量
//        private String buyExNum;
//        // 兑换率
//        private String rate;
//        // 成交时间
//        private long tradeTime;
//        // 交易状态
//        PBTradeStatus tradeStatus;
//        //IP
//        private String IP;
//        //设备信息
//        private String deviceInfo;
//        //卖出积分价值
//        private String sellExPrice;
//        //买入积分价值
//        private String buyExPrice;
//
//        public String getTradeId() {
//            return tradeId;
//        }
//
//        public void setTradeId(String tradeId) {
//            this.tradeId = tradeId;
//        }
//
//        public String getOrderId() {
//            return orderId;
//        }
//
//        public void setOrderId(String orderId) {
//            this.orderId = orderId;
//        }
//
//        public String getOrderGroupId() {
//            return orderGroupId;
//        }
//
//        public void setOrderGroupId(String orderGroupId) {
//            this.orderGroupId = orderGroupId;
//        }
//
//        public String getCycleId() {
//            return cycleId;
//        }
//
//        public void setCycleId(String cycleId) {
//            this.cycleId = cycleId;
//        }
//
//        public String getBroker() {
//            return broker;
//        }
//
//        public void setBroker(String broker) {
//            this.broker = broker;
//        }
//
//        public String getSellExCode() {
//            return sellExCode;
//        }
//
//        public void setSellExCode(String sellExCode) {
//            this.sellExCode = sellExCode;
//        }
//
//        public String getSellExNum() {
//            return sellExNum;
//        }
//
//        public void setSellExNum(String sellExNum) {
//            this.sellExNum = sellExNum;
//        }
//
//        public String getBuyExCode() {
//            return buyExCode;
//        }
//
//        public void setBuyExCode(String buyExCode) {
//            this.buyExCode = buyExCode;
//        }
//
//        public String getBuyExNum() {
//            return buyExNum;
//        }
//
//        public void setBuyExNum(String buyExNum) {
//            this.buyExNum = buyExNum;
//        }
//
//        public String getRate() {
//            return rate;
//        }
//
//        public void setRate(String rate) {
//            this.rate = rate;
//        }
//
//        public long getTradeTime() {
//            return tradeTime;
//        }
//
//        public void setTradeTime(long tradeTime) {
//            this.tradeTime = tradeTime;
//        }
//
//        public com.wanda.idc.exchange.messages.DAMSMessage.PBPointTrade.PBTradeStatus getTradeStatus() {
//            return tradeStatus;
//        }
//
//        public void setTradeStatus(com.wanda.idc.exchange.messages.DAMSMessage.PBPointTrade.PBTradeStatus tradeStatus) {
//            this.tradeStatus = tradeStatus;
//        }
//
//        public String getIP() {
//            return IP;
//        }
//
//        public void setIP(String IP) {
//            this.IP = IP;
//        }
//
//        public String getDeviceInfo() {
//            return deviceInfo;
//        }
//
//        public void setDeviceInfo(String deviceInfo) {
//            this.deviceInfo = deviceInfo;
//        }
//
//        public String getSellExPrice() {
//            return sellExPrice;
//        }
//
//        public void setSellExPrice(String sellExPrice) {
//            this.sellExPrice = sellExPrice;
//        }
//
//        public String getBuyExPrice() {
//            return buyExPrice;
//        }
//
//        public void setBuyExPrice(String buyExPrice) {
//            this.buyExPrice = buyExPrice;
//        }
//    }

}