package me.dingtou.domain;

import java.util.Date;

public class FundOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.order_id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.user_id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.buy_time
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private Date buyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.fund_code
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private String fundCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.order_type
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private String orderType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.outer_order_id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private String outerOrderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.trade_date
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private Date tradeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.trade_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private Integer tradePrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.trade_share
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private Double tradeShare;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.trade_fee
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private Integer tradeFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_order.status
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.order_id
     *
     * @return the value of fund_order.order_id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.order_id
     *
     * @param orderId the value for fund_order.order_id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.user_id
     *
     * @return the value of fund_order.user_id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.user_id
     *
     * @param userId the value for fund_order.user_id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.buy_time
     *
     * @return the value of fund_order.buy_time
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Date getBuyTime() {
        return buyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.buy_time
     *
     * @param buyTime the value for fund_order.buy_time
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.fund_code
     *
     * @return the value of fund_order.fund_code
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.fund_code
     *
     * @param fundCode the value for fund_order.fund_code
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.order_type
     *
     * @return the value of fund_order.order_type
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.order_type
     *
     * @param orderType the value for fund_order.order_type
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.outer_order_id
     *
     * @return the value of fund_order.outer_order_id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getOuterOrderId() {
        return outerOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.outer_order_id
     *
     * @param outerOrderId the value for fund_order.outer_order_id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setOuterOrderId(String outerOrderId) {
        this.outerOrderId = outerOrderId == null ? null : outerOrderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.trade_date
     *
     * @return the value of fund_order.trade_date
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Date getTradeDate() {
        return tradeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.trade_date
     *
     * @param tradeDate the value for fund_order.trade_date
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.trade_price
     *
     * @return the value of fund_order.trade_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Integer getTradePrice() {
        return tradePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.trade_price
     *
     * @param tradePrice the value for fund_order.trade_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setTradePrice(Integer tradePrice) {
        this.tradePrice = tradePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.trade_share
     *
     * @return the value of fund_order.trade_share
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Double getTradeShare() {
        return tradeShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.trade_share
     *
     * @param tradeShare the value for fund_order.trade_share
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setTradeShare(Double tradeShare) {
        this.tradeShare = tradeShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.trade_fee
     *
     * @return the value of fund_order.trade_fee
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Integer getTradeFee() {
        return tradeFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.trade_fee
     *
     * @param tradeFee the value for fund_order.trade_fee
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setTradeFee(Integer tradeFee) {
        this.tradeFee = tradeFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_order.status
     *
     * @return the value of fund_order.status
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_order.status
     *
     * @param status the value for fund_order.status
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}