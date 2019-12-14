package com.qw.korea.sdk.crm.backstage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..third_pay_scale")
public class ThirdPayScale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 游戏id
     */
    @Column(name = "game_id")
    private Integer gameId;

    /**
     * 包名
     */
    @Column(name = "bundle_id")
    private String bundleId;

    /**
     * 已添加的第三方支付,用"|"隔开
     */
    @Column(name = "third_pay")
    private String thirdPay;

    /**
     * 第三方支付可见比例,单位%
     */
    @Column(name = "pay_scale")
    private Byte payScale;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 记录被更新时间
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
     * 获取游戏id
     *
     * @return game_id - 游戏id
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * 设置游戏id
     *
     * @param gameId 游戏id
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    /**
     * 获取包名
     *
     * @return bundle_id - 包名
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * 设置包名
     *
     * @param bundleId 包名
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * 获取已添加的第三方支付,用"|"隔开
     *
     * @return third_pay - 已添加的第三方支付,用"|"隔开
     */
    public String getThirdPay() {
        return thirdPay;
    }

    /**
     * 设置已添加的第三方支付,用"|"隔开
     *
     * @param thirdPay 已添加的第三方支付,用"|"隔开
     */
    public void setThirdPay(String thirdPay) {
        this.thirdPay = thirdPay;
    }

    /**
     * 获取第三方支付可见比例,单位%
     *
     * @return pay_scale - 第三方支付可见比例,单位%
     */
    public Byte getPayScale() {
        return payScale;
    }

    /**
     * 设置第三方支付可见比例,单位%
     *
     * @param payScale 第三方支付可见比例,单位%
     */
    public void setPayScale(Byte payScale) {
        this.payScale = payScale;
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
}