package com.qw.korea.sdk.crm.backstage.entity;

import javax.persistence.*;

@Table(name = "korea_server..google_pay_game_config")
public class GooglePayGameConfig {
    /**
     * gameId(或卖家id)
     */
    @Id
    @Column(name = "game_id")
    private Long gameId;

    /**
     * Google查询订单的客户端id
     */
    @Column(name = "google_client_id")
    private String googleClientId;

    /**
     * 官方分配的rsa秘钥
     */
    @Column(name = "rsa_public_key")
    private String rsaPublicKey;

    /**
     * 获取gameId(或卖家id)
     *
     * @return game_id - gameId(或卖家id)
     */
    public Long getGameId() {
        return gameId;
    }

    /**
     * 设置gameId(或卖家id)
     *
     * @param gameId gameId(或卖家id)
     */
    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    /**
     * 获取Google查询订单的客户端id
     *
     * @return google_client_id - Google查询订单的客户端id
     */
    public String getGoogleClientId() {
        return googleClientId;
    }

    /**
     * 设置Google查询订单的客户端id
     *
     * @param googleClientId Google查询订单的客户端id
     */
    public void setGoogleClientId(String googleClientId) {
        this.googleClientId = googleClientId;
    }

    /**
     * 获取官方分配的rsa秘钥
     *
     * @return rsa_public_key - 官方分配的rsa秘钥
     */
    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    /**
     * 设置官方分配的rsa秘钥
     *
     * @param rsaPublicKey 官方分配的rsa秘钥
     */
    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }
}