package com.qw.korea.sdk.crm.backstage.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..pay_order")
public class PayOrder {
    /**
     * 系统订单号
     */
    @Id
    @Column(name = "order_no")
    private String orderNo;

    /**
     * CP订单号
     */
    @Column(name = "cp_trade_no")
    private String cpTradeNo;

    /**
     * 支付渠道
     */
    @Column(name = "pay_channel")
    private String payChannel;

    /**
     * 支付方式(GOOGLE_PAY,APPLE_PAY,ONE_PAY,PAYPAL,MYCARD)
     */
    @Column(name = "pay_type")
    private String payType;

    /**
     * 订单状态
     */
    @Column(name = "order_status")
    private String orderStatus;

    /**
     * 订单金额
     */
    @Column(name = "order_fee")
    private BigDecimal orderFee;

    /**
     * 支付金额
     */
    @Column(name = "pay_fee")
    private BigDecimal payFee;

    /**
     * 当地币金额
     */
    @Column(name = "show_fee")
    private BigDecimal showFee;

    /**
     * 当地币种
     */
    @Column(name = "show_currency")
    private String showCurrency;

    /**
     * 游戏ID
     */
    @Column(name = "game_id")
    private Integer gameId;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * 游戏服务器ID
     */
    @Column(name = "server_id")
    private Integer serverId;

    /**
     * 服务器名称
     */
    @Column(name = "server_name")
    private String serverName;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户账号
     */
    private String username;

    /**
     * 游戏角色ID
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 游戏角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 网关获取的客户端外网IP
     */
    @Column(name = "client_ip")
    private String clientIp;

    /**
     * 客户端通知支付完成时间
     */
    @Column(name = "client_notify_time")
    private Date clientNotifyTime;

    /**
     * 包ID
     */
    @Column(name = "cp_id")
    private String cpId;

    /**
     * 网关获取的CP外网IP
     */
    @Column(name = "cp_ip")
    private String cpIp;

    /**
     * CP扩展信息,该字段将会在支付成功后原样返回给CP
     */
    @Column(name = "cp_ex_info")
    private String cpExInfo;

    /**
     * CP回调地址
     */
    @Column(name = "cp_callback_url")
    private String cpCallbackUrl;

    /**
     * 回调CP,CP服务端返回结果,0表示成功
     */
    @Column(name = "cp_callback_result")
    private String cpCallbackResult;

    /**
     * 回调CP发货成功时间
     */
    @Column(name = "cp_callback_time")
    private Date cpCallbackTime;

    /**
     * 第三方APPID
     */
    @Column(name = "other_app_id")
    private String otherAppId;

    /**
     * 第三方订单号
     */
    @Column(name = "other_trade_no")
    private String otherTradeNo;

    /**
     * 第三方订单状态
     */
    @Column(name = "other_status")
    private String otherStatus;

    /**
     * 第三方支付币种
     */
    @Column(name = "other_paid_currency")
    private String otherPaidCurrency;

    /**
     * 第三方支付回调金额
     */
    @Column(name = "other_callback_fee")
    private BigDecimal otherCallbackFee;

    /**
     * 第三方回调时间
     */
    @Column(name = "other_callback_time")
    private Date otherCallbackTime;

    /**
     * 接收到第三方回调时间
     */
    @Column(name = "receive_callback_time")
    private Date receiveCallbackTime;

    /**
     * 订单标题(商品名称)
     */
    @Column(name = "order_title")
    private String orderTitle;

    /**
     * 订单描述(商品描述)
     */
    @Column(name = "order_desc")
    private String orderDesc;

    /**
     * 是否已发货标记
     */
    @Column(name = "notify_flag")
    private Boolean notifyFlag;

    /**
     * 是否为测试订单(0非测试订单, 1测试订单)
     */
    @Column(name = "test_order")
    private Boolean testOrder;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 订单到期时间
     */
    @Column(name = "expire_time")
    private Date expireTime;

    /**
     * 记录被更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 扩展备注1
     */
    private String ext;

    /**
     * 拓展备注2
     */
    private String ext2;

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
     * 获取CP订单号
     *
     * @return cp_trade_no - CP订单号
     */
    public String getCpTradeNo() {
        return cpTradeNo;
    }

    /**
     * 设置CP订单号
     *
     * @param cpTradeNo CP订单号
     */
    public void setCpTradeNo(String cpTradeNo) {
        this.cpTradeNo = cpTradeNo;
    }

    /**
     * 获取支付渠道
     *
     * @return pay_channel - 支付渠道
     */
    public String getPayChannel() {
        return payChannel;
    }

    /**
     * 设置支付渠道
     *
     * @param payChannel 支付渠道
     */
    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    /**
     * 获取支付方式(GOOGLE_PAY,APPLE_PAY,ONE_PAY,PAYPAL,MYCARD)
     *
     * @return pay_type - 支付方式(GOOGLE_PAY,APPLE_PAY,ONE_PAY,PAYPAL,MYCARD)
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置支付方式(GOOGLE_PAY,APPLE_PAY,ONE_PAY,PAYPAL,MYCARD)
     *
     * @param payType 支付方式(GOOGLE_PAY,APPLE_PAY,ONE_PAY,PAYPAL,MYCARD)
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * 获取订单状态
     *
     * @return order_status - 订单状态
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单金额
     *
     * @return order_fee - 订单金额
     */
    public BigDecimal getOrderFee() {
        return orderFee;
    }

    /**
     * 设置订单金额
     *
     * @param orderFee 订单金额
     */
    public void setOrderFee(BigDecimal orderFee) {
        this.orderFee = orderFee;
    }

    /**
     * 获取支付金额
     *
     * @return pay_fee - 支付金额
     */
    public BigDecimal getPayFee() {
        return payFee;
    }

    /**
     * 设置支付金额
     *
     * @param payFee 支付金额
     */
    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    /**
     * 获取当地币金额
     *
     * @return show_fee - 当地币金额
     */
    public BigDecimal getShowFee() {
        return showFee;
    }

    /**
     * 设置当地币金额
     *
     * @param showFee 当地币金额
     */
    public void setShowFee(BigDecimal showFee) {
        this.showFee = showFee;
    }

    /**
     * 获取当地币种
     *
     * @return show_currency - 当地币种
     */
    public String getShowCurrency() {
        return showCurrency;
    }

    /**
     * 设置当地币种
     *
     * @param showCurrency 当地币种
     */
    public void setShowCurrency(String showCurrency) {
        this.showCurrency = showCurrency;
    }

    /**
     * 获取游戏ID
     *
     * @return game_id - 游戏ID
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * 设置游戏ID
     *
     * @param gameId 游戏ID
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    /**
     * 获取商品ID
     *
     * @return product_id - 商品ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置商品ID
     *
     * @param productId 商品ID
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取游戏服务器ID
     *
     * @return server_id - 游戏服务器ID
     */
    public Integer getServerId() {
        return serverId;
    }

    /**
     * 设置游戏服务器ID
     *
     * @param serverId 游戏服务器ID
     */
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    /**
     * 获取服务器名称
     *
     * @return server_name - 服务器名称
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * 设置服务器名称
     *
     * @param serverName 服务器名称
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户账号
     *
     * @return username - 用户账号
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户账号
     *
     * @param username 用户账号
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取游戏角色ID
     *
     * @return role_id - 游戏角色ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置游戏角色ID
     *
     * @param roleId 游戏角色ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取游戏角色名称
     *
     * @return role_name - 游戏角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置游戏角色名称
     *
     * @param roleName 游戏角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取网关获取的客户端外网IP
     *
     * @return client_ip - 网关获取的客户端外网IP
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * 设置网关获取的客户端外网IP
     *
     * @param clientIp 网关获取的客户端外网IP
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * 获取客户端通知支付完成时间
     *
     * @return client_notify_time - 客户端通知支付完成时间
     */
    public Date getClientNotifyTime() {
        return clientNotifyTime;
    }

    /**
     * 设置客户端通知支付完成时间
     *
     * @param clientNotifyTime 客户端通知支付完成时间
     */
    public void setClientNotifyTime(Date clientNotifyTime) {
        this.clientNotifyTime = clientNotifyTime;
    }

    /**
     * 获取包ID
     *
     * @return cp_id - 包ID
     */
    public String getCpId() {
        return cpId;
    }

    /**
     * 设置包ID
     *
     * @param cpId 包ID
     */
    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    /**
     * 获取网关获取的CP外网IP
     *
     * @return cp_ip - 网关获取的CP外网IP
     */
    public String getCpIp() {
        return cpIp;
    }

    /**
     * 设置网关获取的CP外网IP
     *
     * @param cpIp 网关获取的CP外网IP
     */
    public void setCpIp(String cpIp) {
        this.cpIp = cpIp;
    }

    /**
     * 获取CP扩展信息,该字段将会在支付成功后原样返回给CP
     *
     * @return cp_ex_info - CP扩展信息,该字段将会在支付成功后原样返回给CP
     */
    public String getCpExInfo() {
        return cpExInfo;
    }

    /**
     * 设置CP扩展信息,该字段将会在支付成功后原样返回给CP
     *
     * @param cpExInfo CP扩展信息,该字段将会在支付成功后原样返回给CP
     */
    public void setCpExInfo(String cpExInfo) {
        this.cpExInfo = cpExInfo;
    }

    /**
     * 获取CP回调地址
     *
     * @return cp_callback_url - CP回调地址
     */
    public String getCpCallbackUrl() {
        return cpCallbackUrl;
    }

    /**
     * 设置CP回调地址
     *
     * @param cpCallbackUrl CP回调地址
     */
    public void setCpCallbackUrl(String cpCallbackUrl) {
        this.cpCallbackUrl = cpCallbackUrl;
    }

    /**
     * 获取回调CP,CP服务端返回结果,0表示成功
     *
     * @return cp_callback_result - 回调CP,CP服务端返回结果,0表示成功
     */
    public String getCpCallbackResult() {
        return cpCallbackResult;
    }

    /**
     * 设置回调CP,CP服务端返回结果,0表示成功
     *
     * @param cpCallbackResult 回调CP,CP服务端返回结果,0表示成功
     */
    public void setCpCallbackResult(String cpCallbackResult) {
        this.cpCallbackResult = cpCallbackResult;
    }

    /**
     * 获取回调CP发货成功时间
     *
     * @return cp_callback_time - 回调CP发货成功时间
     */
    public Date getCpCallbackTime() {
        return cpCallbackTime;
    }

    /**
     * 设置回调CP发货成功时间
     *
     * @param cpCallbackTime 回调CP发货成功时间
     */
    public void setCpCallbackTime(Date cpCallbackTime) {
        this.cpCallbackTime = cpCallbackTime;
    }

    /**
     * 获取第三方APPID
     *
     * @return other_app_id - 第三方APPID
     */
    public String getOtherAppId() {
        return otherAppId;
    }

    /**
     * 设置第三方APPID
     *
     * @param otherAppId 第三方APPID
     */
    public void setOtherAppId(String otherAppId) {
        this.otherAppId = otherAppId;
    }

    /**
     * 获取第三方订单号
     *
     * @return other_trade_no - 第三方订单号
     */
    public String getOtherTradeNo() {
        return otherTradeNo;
    }

    /**
     * 设置第三方订单号
     *
     * @param otherTradeNo 第三方订单号
     */
    public void setOtherTradeNo(String otherTradeNo) {
        this.otherTradeNo = otherTradeNo;
    }

    /**
     * 获取第三方订单状态
     *
     * @return other_status - 第三方订单状态
     */
    public String getOtherStatus() {
        return otherStatus;
    }

    /**
     * 设置第三方订单状态
     *
     * @param otherStatus 第三方订单状态
     */
    public void setOtherStatus(String otherStatus) {
        this.otherStatus = otherStatus;
    }

    /**
     * 获取第三方支付币种
     *
     * @return other_paid_currency - 第三方支付币种
     */
    public String getOtherPaidCurrency() {
        return otherPaidCurrency;
    }

    /**
     * 设置第三方支付币种
     *
     * @param otherPaidCurrency 第三方支付币种
     */
    public void setOtherPaidCurrency(String otherPaidCurrency) {
        this.otherPaidCurrency = otherPaidCurrency;
    }

    /**
     * 获取第三方支付回调金额
     *
     * @return other_callback_fee - 第三方支付回调金额
     */
    public BigDecimal getOtherCallbackFee() {
        return otherCallbackFee;
    }

    /**
     * 设置第三方支付回调金额
     *
     * @param otherCallbackFee 第三方支付回调金额
     */
    public void setOtherCallbackFee(BigDecimal otherCallbackFee) {
        this.otherCallbackFee = otherCallbackFee;
    }

    /**
     * 获取第三方回调时间
     *
     * @return other_callback_time - 第三方回调时间
     */
    public Date getOtherCallbackTime() {
        return otherCallbackTime;
    }

    /**
     * 设置第三方回调时间
     *
     * @param otherCallbackTime 第三方回调时间
     */
    public void setOtherCallbackTime(Date otherCallbackTime) {
        this.otherCallbackTime = otherCallbackTime;
    }

    /**
     * 获取接收到第三方回调时间
     *
     * @return receive_callback_time - 接收到第三方回调时间
     */
    public Date getReceiveCallbackTime() {
        return receiveCallbackTime;
    }

    /**
     * 设置接收到第三方回调时间
     *
     * @param receiveCallbackTime 接收到第三方回调时间
     */
    public void setReceiveCallbackTime(Date receiveCallbackTime) {
        this.receiveCallbackTime = receiveCallbackTime;
    }

    /**
     * 获取订单标题(商品名称)
     *
     * @return order_title - 订单标题(商品名称)
     */
    public String getOrderTitle() {
        return orderTitle;
    }

    /**
     * 设置订单标题(商品名称)
     *
     * @param orderTitle 订单标题(商品名称)
     */
    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    /**
     * 获取订单描述(商品描述)
     *
     * @return order_desc - 订单描述(商品描述)
     */
    public String getOrderDesc() {
        return orderDesc;
    }

    /**
     * 设置订单描述(商品描述)
     *
     * @param orderDesc 订单描述(商品描述)
     */
    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    /**
     * 获取是否已发货标记
     *
     * @return notify_flag - 是否已发货标记
     */
    public Boolean getNotifyFlag() {
        return notifyFlag;
    }

    /**
     * 设置是否已发货标记
     *
     * @param notifyFlag 是否已发货标记
     */
    public void setNotifyFlag(Boolean notifyFlag) {
        this.notifyFlag = notifyFlag;
    }

    /**
     * 获取是否为测试订单(0非测试订单, 1测试订单)
     *
     * @return test_order - 是否为测试订单(0非测试订单, 1测试订单)
     */
    public Boolean getTestOrder() {
        return testOrder;
    }

    /**
     * 设置是否为测试订单(0非测试订单, 1测试订单)
     *
     * @param testOrder 是否为测试订单(0非测试订单, 1测试订单)
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
     * 获取订单到期时间
     *
     * @return expire_time - 订单到期时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置订单到期时间
     *
     * @param expireTime 订单到期时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取记录被更新时间
     *
     * @return update_time - 记录被更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置记录被更新时间
     *
     * @param updateTime 记录被更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取备注信息
     *
     * @return remark - 备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注信息
     *
     * @param remark 备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取扩展备注1
     *
     * @return ext - 扩展备注1
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置扩展备注1
     *
     * @param ext 扩展备注1
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    /**
     * 获取拓展备注2
     *
     * @return ext2 - 拓展备注2
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * 设置拓展备注2
     *
     * @param ext2 拓展备注2
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }
}