package com.qw.korea.sdk.crm.backstage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "korea_server..operation_log")
public class OperationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 游戏Id
     */
    @Column(name = "game_id")
    private Integer gameId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 种类
     */
    private String category;

    /**
     * 操作类别(第三方支付 , 用户等)
     */
    private String type;

    /**
     * 操作具体内容
     */
    @Column(name = "operation_content")
    private String operationContent;

    /**
     * 操作人员
     */
    private String operator;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 操作时间
     */
    @Column(name = "operation_time")
    private Date operationTime;

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
     * 获取游戏Id
     *
     * @return game_id - 游戏Id
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * 设置游戏Id
     *
     * @param gameId 游戏Id
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
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
     * 获取种类
     *
     * @return category - 种类
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置种类
     *
     * @param category 种类
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取操作类别(第三方支付 , 用户等)
     *
     * @return type - 操作类别(第三方支付 , 用户等)
     */
    public String getType() {
        return type;
    }

    /**
     * 设置操作类别(第三方支付 , 用户等)
     *
     * @param type 操作类别(第三方支付 , 用户等)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取操作具体内容
     *
     * @return operation_content - 操作具体内容
     */
    public String getOperationContent() {
        return operationContent;
    }

    /**
     * 设置操作具体内容
     *
     * @param operationContent 操作具体内容
     */
    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent;
    }

    /**
     * 获取操作人员
     *
     * @return operator - 操作人员
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人员
     *
     * @param operator 操作人员
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取IP地址
     *
     * @return ip - IP地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置IP地址
     *
     * @param ip IP地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取操作时间
     *
     * @return operation_time - 操作时间
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * 设置操作时间
     *
     * @param operationTime 操作时间
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }
}