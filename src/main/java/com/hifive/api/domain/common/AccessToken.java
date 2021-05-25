package com.hifive.api.domain.common;

import com.hifive.api.internal.mapping.ApiField;

import java.io.Serializable;

/**
 * Name:accessToken
 *
 * @author: 陈东元
 * Date: 2020-10-30
 */
public class AccessToken implements Serializable {
    /**
     * 登录令牌
     */
    @ApiField("token")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
