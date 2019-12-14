package com.qw.korea.sdk.crm.backstage.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..product_pay_type")
public class ProductPayType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品iD
     */
    @Column(name = "product_info_id")
    private Integer productInfoId;

    /**
     * 支付方式
     */
    @Column(name = "pay_type")
    private String payType;

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
     * 实际支付价格
     */
    @Column(name = "pay_fee")
    private BigDecimal payFee;

    /**
     * 实际支付货币种类
     */
    @Column(name = "pay_currency")
    private String payCurrency;

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
     * 获取商品iD
     *
     * @return product_info_id - 商品iD
     */
    public Integer getProductInfoId() {
        return productInfoId;
    }

    /**
     * 设置商品iD
     *
     * @param productInfoId 商品iD
     */
    public void setProductInfoId(Integer productInfoId) {
        this.productInfoId = productInfoId;
    }

    /**
     * 获取支付方式
     *
     * @return pay_type - 支付方式
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置支付方式
     *
     * @param payType 支付方式
     */
    public void setPayType(String payType) {
        this.payType = payType;
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
     * 获取实际支付价格
     *
     * @return pay_fee - 实际支付价格
     */
    public BigDecimal getPayFee() {
        return payFee;
    }

    /**
     * 设置实际支付价格
     *
     * @param payFee 实际支付价格
     */
    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    /**
     * 获取实际支付货币种类
     *
     * @return pay_currency - 实际支付货币种类
     */
    public String getPayCurrency() {
        return payCurrency;
    }

    /**
     * 设置实际支付货币种类
     *
     * @param payCurrency 实际支付货币种类
     */
    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
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