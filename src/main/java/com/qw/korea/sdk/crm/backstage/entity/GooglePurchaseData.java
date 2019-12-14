package com.qw.korea.sdk.crm.backstage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..google_purchase_data")
public class GooglePurchaseData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 谷歌订单号
     */
    @Column(name = "google_order_no")
    private String googleOrderNo;

    /**
     * 支付中心订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 谷歌购买时返回的令牌
     */
    @Column(name = "purchase_token")
    private String purchaseToken;

    /**
     * 消费标志。1-已经消费
     */
    @Column(name = "consume_flag")
    private Boolean consumeFlag;

    /**
     * 这种类型表示androidpublisher服务中的一个inappPurchase对象
     */
    private String kind;

    /**
     * 0 购买, 1 取消
     */
    @Column(name = "purchase_state")
    private Integer purchaseState;

    /**
     * 1 消费, 0 尚未消费
     */
    @Column(name = "consumption_state")
    private Integer consumptionState;

    /**
     * 0 测试订单, 1 正式订单
     */
    @Column(name = "purchase_type")
    private Integer purchaseType;

    /**
     * purchase_time
     */
    @Column(name = "purchase_time")
    private Date purchaseTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取谷歌订单号
     *
     * @return google_order_no - 谷歌订单号
     */
    public String getGoogleOrderNo() {
        return googleOrderNo;
    }

    /**
     * 设置谷歌订单号
     *
     * @param googleOrderNo 谷歌订单号
     */
    public void setGoogleOrderNo(String googleOrderNo) {
        this.googleOrderNo = googleOrderNo;
    }

    /**
     * 获取支付中心订单号
     *
     * @return order_no - 支付中心订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置支付中心订单号
     *
     * @param orderNo 支付中心订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取谷歌购买时返回的令牌
     *
     * @return purchase_token - 谷歌购买时返回的令牌
     */
    public String getPurchaseToken() {
        return purchaseToken;
    }

    /**
     * 设置谷歌购买时返回的令牌
     *
     * @param purchaseToken 谷歌购买时返回的令牌
     */
    public void setPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
    }

    /**
     * 获取消费标志。1-已经消费
     *
     * @return consume_flag - 消费标志。1-已经消费
     */
    public Boolean getConsumeFlag() {
        return consumeFlag;
    }

    /**
     * 设置消费标志。1-已经消费
     *
     * @param consumeFlag 消费标志。1-已经消费
     */
    public void setConsumeFlag(Boolean consumeFlag) {
        this.consumeFlag = consumeFlag;
    }

    /**
     * 获取这种类型表示androidpublisher服务中的一个inappPurchase对象
     *
     * @return kind - 这种类型表示androidpublisher服务中的一个inappPurchase对象
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置这种类型表示androidpublisher服务中的一个inappPurchase对象
     *
     * @param kind 这种类型表示androidpublisher服务中的一个inappPurchase对象
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 获取0 购买, 1 取消
     *
     * @return purchase_state - 0 购买, 1 取消
     */
    public Integer getPurchaseState() {
        return purchaseState;
    }

    /**
     * 设置0 购买, 1 取消
     *
     * @param purchaseState 0 购买, 1 取消
     */
    public void setPurchaseState(Integer purchaseState) {
        this.purchaseState = purchaseState;
    }

    /**
     * 获取1 消费, 0 尚未消费
     *
     * @return consumption_state - 1 消费, 0 尚未消费
     */
    public Integer getConsumptionState() {
        return consumptionState;
    }

    /**
     * 设置1 消费, 0 尚未消费
     *
     * @param consumptionState 1 消费, 0 尚未消费
     */
    public void setConsumptionState(Integer consumptionState) {
        this.consumptionState = consumptionState;
    }

    /**
     * 获取0 测试订单, 1 正式订单
     *
     * @return purchase_type - 0 测试订单, 1 正式订单
     */
    public Integer getPurchaseType() {
        return purchaseType;
    }

    /**
     * 设置0 测试订单, 1 正式订单
     *
     * @param purchaseType 0 测试订单, 1 正式订单
     */
    public void setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
    }

    /**
     * 获取purchase_time
     *
     * @return purchase_time - purchase_time
     */
    public Date getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * 设置purchase_time
     *
     * @param purchaseTime purchase_time
     */
    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
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
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}