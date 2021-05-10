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
    @ApiField("accessToken")
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
