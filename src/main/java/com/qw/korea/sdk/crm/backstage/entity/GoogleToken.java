package com.qw.korea.sdk.crm.backstage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..google_token")
public class GoogleToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Google  clientId
     */
    @Column(name = "client_id")
    private String clientId;

    /**
     * Google  秘钥
     */
    @Column(name = "client_secret")
    private String clientSecret;

    /**
     * Google 刷新Token, 长时间有效
     */
    @Column(name = "refresh_token")
    private String refreshToken;

    /**
     * 临时token， 有效时间1小时, 超过1小时会过期, 需要调用refresh_token来获取新的access_token
     */
    @Column(name = "access_token")
    private String accessToken;

    /**
     * access_token过期时间(单位秒)
     */
    @Column(name = "expires_in")
    private Integer expiresIn;

    /**
     * access_token的类型
     */
    @Column(name = "token_type")
    private String tokenType;

    /**
     * refresh_token兑换AccessToken时， 避免其他线程重复刷新AccessToken； UNLOCK 正常使用, LOCK 其他线程在刷新AccessToken
     */
    private String status;

    /**
     * 记录refresh_token兑换AccessToken的开始时间, 时间超过2分钟，即允许其他线程操作
     */
    @Column(name = "refresh_start_time")
    private Date refreshStartTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最近修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

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
     * 获取Google  clientId
     *
     * @return client_id - Google  clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * 设置Google  clientId
     *
     * @param clientId Google  clientId
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取Google  秘钥
     *
     * @return client_secret - Google  秘钥
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * 设置Google  秘钥
     *
     * @param clientSecret Google  秘钥
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * 获取Google 刷新Token, 长时间有效
     *
     * @return refresh_token - Google 刷新Token, 长时间有效
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * 设置Google 刷新Token, 长时间有效
     *
     * @param refreshToken Google 刷新Token, 长时间有效
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * 获取临时token， 有效时间1小时, 超过1小时会过期, 需要调用refresh_token来获取新的access_token
     *
     * @return access_token - 临时token， 有效时间1小时, 超过1小时会过期, 需要调用refresh_token来获取新的access_token
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 设置临时token， 有效时间1小时, 超过1小时会过期, 需要调用refresh_token来获取新的access_token
     *
     * @param accessToken 临时token， 有效时间1小时, 超过1小时会过期, 需要调用refresh_token来获取新的access_token
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 获取access_token过期时间(单位秒)
     *
     * @return expires_in - access_token过期时间(单位秒)
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * 设置access_token过期时间(单位秒)
     *
     * @param expiresIn access_token过期时间(单位秒)
     */
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * 获取access_token的类型
     *
     * @return token_type - access_token的类型
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * 设置access_token的类型
     *
     * @param tokenType access_token的类型
     */
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * 获取refresh_token兑换AccessToken时， 避免其他线程重复刷新AccessToken； UNLOCK 正常使用, LOCK 其他线程在刷新AccessToken
     *
     * @return status - refresh_token兑换AccessToken时， 避免其他线程重复刷新AccessToken； UNLOCK 正常使用, LOCK 其他线程在刷新AccessToken
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置refresh_token兑换AccessToken时， 避免其他线程重复刷新AccessToken； UNLOCK 正常使用, LOCK 其他线程在刷新AccessToken
     *
     * @param status refresh_token兑换AccessToken时， 避免其他线程重复刷新AccessToken； UNLOCK 正常使用, LOCK 其他线程在刷新AccessToken
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取记录refresh_token兑换AccessToken的开始时间, 时间超过2分钟，即允许其他线程操作
     *
     * @return refresh_start_time - 记录refresh_token兑换AccessToken的开始时间, 时间超过2分钟，即允许其他线程操作
     */
    public Date getRefreshStartTime() {
        return refreshStartTime;
    }

    /**
     * 设置记录refresh_token兑换AccessToken的开始时间, 时间超过2分钟，即允许其他线程操作
     *
     * @param refreshStartTime 记录refresh_token兑换AccessToken的开始时间, 时间超过2分钟，即允许其他线程操作
     */
    public void setRefreshStartTime(Date refreshStartTime) {
        this.refreshStartTime = refreshStartTime;
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
     * 获取最近修改时间
     *
     * @return modify_time - 最近修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置最近修改时间
     *
     * @param modifyTime 最近修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}