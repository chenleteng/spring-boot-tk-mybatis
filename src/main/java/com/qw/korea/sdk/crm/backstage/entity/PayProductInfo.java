package com.qw.korea.sdk.crm.backstage.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..pay_product_info")
public class PayProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * gameId(或卖家id)
     */
    @Column(name = "seller_id")
    private Integer sellerId;

    /**
     * seller_id对应ios包的包id
     */
    @Column(name = "bundle_id")
    private String bundleId;

    /**
     * 对应bundle_id的商品id
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品支付价格
     */
    @Column(name = "fee_price")
    private BigDecimal feePrice;

    /**
     * 支付货币种类
     */
    @Column(name = "fee_currency")
    private String feeCurrency;

    /**
     * 显示价格
     */
    @Column(name = "show_fee")
    private BigDecimal showFee;

    /**
     * 显示货币种类
     */
    @Column(name = "show_currency")
    private String showCurrency;

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
     * 获取gameId(或卖家id)
     *
     * @return seller_id - gameId(或卖家id)
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * 设置gameId(或卖家id)
     *
     * @param sellerId gameId(或卖家id)
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 获取seller_id对应ios包的包id
     *
     * @return bundle_id - seller_id对应ios包的包id
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * 设置seller_id对应ios包的包id
     *
     * @param bundleId seller_id对应ios包的包id
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * 获取对应bundle_id的商品id
     *
     * @return product_id - 对应bundle_id的商品id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置对应bundle_id的商品id
     *
     * @param productId 对应bundle_id的商品id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取商品支付价格
     *
     * @return fee_price - 商品支付价格
     */
    public BigDecimal getFeePrice() {
        return feePrice;
    }

    /**
     * 设置商品支付价格
     *
     * @param feePrice 商品支付价格
     */
    public void setFeePrice(BigDecimal feePrice) {
        this.feePrice = feePrice;
    }

    /**
     * 获取支付货币种类
     *
     * @return fee_currency - 支付货币种类
     */
    public String getFeeCurrency() {
        return feeCurrency;
    }

    /**
     * 设置支付货币种类
     *
     * @param feeCurrency 支付货币种类
     */
    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    /**
     * 获取显示价格
     *
     * @return show_fee - 显示价格
     */
    public BigDecimal getShowFee() {
        return showFee;
    }

    /**
     * 设置显示价格
     *
     * @param showFee 显示价格
     */
    public void setShowFee(BigDecimal showFee) {
        this.showFee = showFee;
    }

    /**
     * 获取显示货币种类
     *
     * @return show_currency - 显示货币种类
     */
    public String getShowCurrency() {
        return showCurrency;
    }

    /**
     * 设置显示货币种类
     *
     * @param showCurrency 显示货币种类
     */
    public void setShowCurrency(String showCurrency) {
        this.showCurrency = showCurrency;
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