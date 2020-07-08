package me.dingtou.domain;

import java.util.Date;

public class FundDailyPrice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_daily_price.id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_daily_price.fund_code
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private String fundCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_daily_price.price_date
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private Date priceDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_daily_price.unit_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private String unitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_daily_price.total_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private String totalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_daily_price.increase
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private String increase;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_daily_price.buy_status
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private String buyStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_daily_price.sell_status
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private String sellStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_daily_price.memo
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    private String memo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_daily_price.id
     *
     * @return the value of fund_daily_price.id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_daily_price.id
     *
     * @param id the value for fund_daily_price.id
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_daily_price.fund_code
     *
     * @return the value of fund_daily_price.fund_code
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_daily_price.fund_code
     *
     * @param fundCode the value for fund_daily_price.fund_code
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_daily_price.price_date
     *
     * @return the value of fund_daily_price.price_date
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public Date getPriceDate() {
        return priceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_daily_price.price_date
     *
     * @param priceDate the value for fund_daily_price.price_date
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setPriceDate(Date priceDate) {
        this.priceDate = priceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_daily_price.unit_price
     *
     * @return the value of fund_daily_price.unit_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_daily_price.unit_price
     *
     * @param unitPrice the value for fund_daily_price.unit_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice == null ? null : unitPrice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_daily_price.total_price
     *
     * @return the value of fund_daily_price.total_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_daily_price.total_price
     *
     * @param totalPrice the value for fund_daily_price.total_price
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_daily_price.increase
     *
     * @return the value of fund_daily_price.increase
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getIncrease() {
        return increase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_daily_price.increase
     *
     * @param increase the value for fund_daily_price.increase
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setIncrease(String increase) {
        this.increase = increase == null ? null : increase.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_daily_price.buy_status
     *
     * @return the value of fund_daily_price.buy_status
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getBuyStatus() {
        return buyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_daily_price.buy_status
     *
     * @param buyStatus the value for fund_daily_price.buy_status
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setBuyStatus(String buyStatus) {
        this.buyStatus = buyStatus == null ? null : buyStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_daily_price.sell_status
     *
     * @return the value of fund_daily_price.sell_status
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getSellStatus() {
        return sellStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_daily_price.sell_status
     *
     * @param sellStatus the value for fund_daily_price.sell_status
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setSellStatus(String sellStatus) {
        this.sellStatus = sellStatus == null ? null : sellStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_daily_price.memo
     *
     * @return the value of fund_daily_price.memo
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_daily_price.memo
     *
     * @param memo the value for fund_daily_price.memo
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}