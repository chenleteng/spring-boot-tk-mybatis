package com.qw.korea.sdk.crm.backstage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..appstore_receipt_data")
public class AppstoreReceiptData {
    /**
     * receipt_data的md5字符串
     */
    @Id
    @Column(name = "receipt_id")
    private String receiptId;

    /**
     * 系统订单号
     */
    @Column(name = "order_no")
    private String orderNo;

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
     * 备注
     */
    private String remark;

    /**
     * IOS的支付凭证
     */
    @Column(name = "receipt_data")
    private String receiptData;

    /**
     * 获取receipt_data的md5字符串
     *
     * @return receipt_id - receipt_data的md5字符串
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * 设置receipt_data的md5字符串
     *
     * @param receiptId receipt_data的md5字符串
     */
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * 获取系统订单号
     *
     * @return order_no - 系统订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置系统订单号
     *
     * @param orderNo 系统订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取IOS的支付凭证
     *
     * @return receipt_data - IOS的支付凭证
     */
    public String getReceiptData() {
        return receiptData;
    }

    /**
     * 设置IOS的支付凭证
     *
     * @param receiptData IOS的支付凭证
     */
    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
    }
}