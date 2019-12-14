package com.qw.korea.sdk.crm.backstage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..game_config")
public class GameConfig {
    /**
     * 游戏id
     */
    @Id
    @Column(name = "game_id")
    private Integer gameId;

    /**
     * 游戏的代码
     */
    private String code;

    /**
     * 游戏的名称
     */
    private String name;

    /**
     * 系统类型
     */
    @Column(name = "os_type")
    private String osType;

    /**
     * 加密密匙
     */
    @Column(name = "secret_key")
    private String secretKey;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取游戏的代码
     *
     * @return code - 游戏的代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置游戏的代码
     *
     * @param code 游戏的代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取游戏的名称
     *
     * @return name - 游戏的名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置游戏的名称
     *
     * @param name 游戏的名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取系统类型
     *
     * @return os_type - 系统类型
     */
    public String getOsType() {
        return osType;
    }

    /**
     * 设置系统类型
     *
     * @param osType 系统类型
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * 获取加密密匙
     *
     * @return secret_key - 加密密匙
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * 设置加密密匙
     *
     * @param secretKey 加密密匙
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
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
}