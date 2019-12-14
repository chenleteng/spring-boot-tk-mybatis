package com.qw.korea.sdk.crm.backstage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..appstore_verify_info")
public class AppstoreVerifyInfo {
    /**
     * appstore订单号
     */
    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    /**
     * 系统订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * receipt_data的md5字符串
     */
    @Column(name = "receipt_id")
    private String receiptId;

    /**
     * 是否为测试订单
     */
    @Column(name = "test_order")
    private Boolean testOrder;

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
     * 支付凭证校验结果
     */
    @Column(name = "verify_info")
    private String verifyInfo;

    /**
     * 获取appstore订单号
     *
     * @return transaction_id - appstore订单号
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置appstore订单号
     *
     * @param transactionId appstore订单号
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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
     * 获取是否为测试订单
     *
     * @return test_order - 是否为测试订单
     */
    public Boolean getTestOrder() {
        return testOrder;
    }

    /**
     * 设置是否为测试订单
     *
     * @param testOrder 是否为测试订单
     */
    public void setTestOrder(Boolean testOrder) {
        this.testOrder = testOrder;
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
     * 获取支付凭证校验结果
     *
     * @return verify_info - 支付凭证校验结果
     */
    public String getVerifyInfo() {
        return verifyInfo;
    }

    /**
     * 设置支付凭证校验结果
     *
     * @param verifyInfo 支付凭证校验结果
     */
    public void setVerifyInfo(String verifyInfo) {
        this.verifyInfo = verifyInfo;
    }
}