package com.qw.korea.sdk.crm.backstage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..pay_mycard_record")
public class PayMycardRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 厂商交易序号（我方订单号）
     */
    @Column(name = "fac_trade_seq")
    private String facTradeSeq;

    @Column(name = "auth_code")
    private String authCode;

    /**
     * 成功定向的地址
     */
    @Column(name = "return_url")
    private String returnUrl;

    /**
     * 失败的定向地址
     */
    @Column(name = "cancel_url")
    private String cancelUrl;

    /**
     * 交易结果代码：3-成功，0-失败
     */
    @Column(name = "pay_result")
    private Integer payResult;

    /**
     * 请款状态：0-初始，1-成功，2-失败
     */
    @Column(name = "payout_status")
    private Integer payoutStatus;

    /**
     * 付费方式
     */
    @Column(name = "payment_type")
    private String paymentType;

    /**
     * MyCard交易序号
     */
    @Column(name = "trade_seq")
    private String tradeSeq;

    /**
     * 驗證 MyCard 交易結果获得
     */
    @Column(name = "trade_no")
    private String tradeNo;

    /**
     * 会员代号
     */
    @Column(name = "customer_id")
    private String customerId;

    /**
     * 金额
     */
    private String amount;

    /**
     * 货币
     */
    private String currency;

    /**
     * 交易时间，格式：yyyy-MM-ddTHH:mm:ss
     */
    @Column(name = "trade_date_time")
    private String tradeDateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取厂商交易序号（我方订单号）
     *
     * @return fac_trade_seq - 厂商交易序号（我方订单号）
     */
    public String getFacTradeSeq() {
        return facTradeSeq;
    }

    /**
     * 设置厂商交易序号（我方订单号）
     *
     * @param facTradeSeq 厂商交易序号（我方订单号）
     */
    public void setFacTradeSeq(String facTradeSeq) {
        this.facTradeSeq = facTradeSeq;
    }

    /**
     * @return auth_code
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * @param authCode
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * 获取成功定向的地址
     *
     * @return return_url - 成功定向的地址
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * 设置成功定向的地址
     *
     * @param returnUrl 成功定向的地址
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * 获取失败的定向地址
     *
     * @return cancel_url - 失败的定向地址
     */
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * 设置失败的定向地址
     *
     * @param cancelUrl 失败的定向地址
     */
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    /**
     * 获取交易结果代码：3-成功，0-失败
     *
     * @return pay_result - 交易结果代码：3-成功，0-失败
     */
    public Integer getPayResult() {
        return payResult;
    }

    /**
     * 设置交易结果代码：3-成功，0-失败
     *
     * @param payResult 交易结果代码：3-成功，0-失败
     */
    public void setPayResult(Integer payResult) {
        this.payResult = payResult;
    }

    /**
     * 获取请款状态：0-初始，1-成功，2-失败
     *
     * @return payout_status - 请款状态：0-初始，1-成功，2-失败
     */
    public Integer getPayoutStatus() {
        return payoutStatus;
    }

    /**
     * 设置请款状态：0-初始，1-成功，2-失败
     *
     * @param payoutStatus 请款状态：0-初始，1-成功，2-失败
     */
    public void setPayoutStatus(Integer payoutStatus) {
        this.payoutStatus = payoutStatus;
    }

    /**
     * 获取付费方式
     *
     * @return payment_type - 付费方式
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 设置付费方式
     *
     * @param paymentType 付费方式
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 获取MyCard交易序号
     *
     * @return trade_seq - MyCard交易序号
     */
    public String getTradeSeq() {
        return tradeSeq;
    }

    /**
     * 设置MyCard交易序号
     *
     * @param tradeSeq MyCard交易序号
     */
    public void setTradeSeq(String tradeSeq) {
        this.tradeSeq = tradeSeq;
    }

    /**
     * 获取驗證 MyCard 交易結果获得
     *
     * @return trade_no - 驗證 MyCard 交易結果获得
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置驗證 MyCard 交易結果获得
     *
     * @param tradeNo 驗證 MyCard 交易結果获得
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * 获取会员代号
     *
     * @return customer_id - 会员代号
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置会员代号
     *
     * @param customerId 会员代号
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 获取货币
     *
     * @return currency - 货币
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置货币
     *
     * @param currency 货币
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 获取交易时间，格式：yyyy-MM-ddTHH:mm:ss
     *
     * @return trade_date_time - 交易时间，格式：yyyy-MM-ddTHH:mm:ss
     */
    public String getTradeDateTime() {
        return tradeDateTime;
    }

    /**
     * 设置交易时间，格式：yyyy-MM-ddTHH:mm:ss
     *
     * @param tradeDateTime 交易时间，格式：yyyy-MM-ddTHH:mm:ss
     */
    public void setTradeDateTime(String tradeDateTime) {
        this.tradeDateTime = tradeDateTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}