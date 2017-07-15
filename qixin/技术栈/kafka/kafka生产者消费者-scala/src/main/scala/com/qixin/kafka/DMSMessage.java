package com.qixin.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * DMS营销系统kafka消息结构
 */
public final class DMSMessage {
    public static final class PBPointTradeDMS {
        public static PBPointTradeDMS newBuilder() {
            return new PBPointTradeDMS();
        }

        static ObjectMapper mapper = new ObjectMapper();

        public static PBPointTradeDMS parseFrom(byte[] message) throws IOException {
            return mapper.readValue(new String(message, "utf-8"), PBPointTradeDMS.class);
        }

        public byte[] toByteArray() throws IOException {
            return mapper.writeValueAsString(this).getBytes("utf-8");
        }

        public enum PBTradeStatus {
            // 结算成功,撤销订单,未知状态,错误
            SUCCESS(0), CANCEL(1), UNKNOWN(2), ERROR(3);
            private int value;
            PBTradeStatus(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }
        }

        public static PBPointTradeDMS parseToDMS(DAMSMessage.PBPointTrade pbPointTrade) {
                PBPointTradeDMS pbPointTradeDMS = new PBPointTradeDMS();
                pbPointTradeDMS.tradeId = pbPointTrade.getTradeId();
                pbPointTradeDMS.broker = pbPointTrade.getBroker();
                pbPointTradeDMS.orderId = pbPointTrade.getOrderId();
                pbPointTradeDMS.orderGroupId = pbPointTrade.getOrderGroupId();
                pbPointTradeDMS.buyExCode = pbPointTrade.getBuyExCode();
                pbPointTradeDMS.buyExNum = Integer.valueOf(pbPointTrade.getBuyExNum());
                pbPointTradeDMS.sellExCode = pbPointTrade.getSellExCode();
                pbPointTradeDMS.sellExNum = Integer.valueOf(pbPointTrade.getSellExNum());
                pbPointTradeDMS.tradeTime = pbPointTrade.getTradeTime();

            return pbPointTradeDMS;
        }

        @Override
        public String toString() {
            return "PBPointTrade{" +
                    "tradeId='" + tradeId + '\'' +
                    ", orderId='" + orderId + '\'' +
                    ", orderGroupId='" + orderGroupId + '\'' +
                    ", broker='" + broker + '\'' +
                    ", sellExCode='" + sellExCode + '\'' +
                    ", sellExNum='" + sellExNum + '\'' +
                    ", buyExCode='" + buyExCode + '\'' +
                    ", buyExNum='" + buyExNum + '\'' +
                    ", tradeTime=" + tradeTime +
                    '}';
        }

        // 交易唯一标识符
        private String tradeId;
        // 订单号
        private String orderId;
        // 订单组编号
        private String orderGroupId;
        // 提交订单用户名
        private String broker;
        // 卖出积分品种编号
        private String sellExCode;
        // 卖出积分品种数量
        private int sellExNum;
        // 买入积分品种编号
        private String buyExCode;
        // 买入积分品种数量
        private int buyExNum;
        // 成交时间
        private long tradeTime;

        public String getTradeId() {
            return tradeId;
        }

        public void setTradeId(String tradeId) {
            this.tradeId = tradeId;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getOrderGroupId() {
            return orderGroupId;
        }

        public void setOrderGroupId(String orderGroupId) {
            this.orderGroupId = orderGroupId;
        }

        public String getBroker() {
            return broker;
        }

        public void setBroker(String broker) {
            this.broker = broker;
        }

        public String getSellExCode() {
            return sellExCode;
        }

        public void setSellExCode(String sellExCode) {
            this.sellExCode = sellExCode;
        }

        public int getSellExNum() {
            return sellExNum;
        }

        public void setSellExNum(int sellExNum) {
            this.sellExNum = sellExNum;
        }

        public String getBuyExCode() {
            return buyExCode;
        }

        public void setBuyExCode(String buyExCode) {
            this.buyExCode = buyExCode;
        }

        public int getBuyExNum() {
            return buyExNum;
        }

        public void setBuyExNum(int buyExNum) {
            this.buyExNum = buyExNum;
        }

        public long getTradeTime() {
            return tradeTime;
        }

        public void setTradeTime(long tradeTime) {
            this.tradeTime = tradeTime;
        }
    }
}