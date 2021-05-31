package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.AccessToken;
import com.hifive.api.internal.mapping.ApiField;

/**
 * @author meiyang
 * @version 1.0
 **/
public class HFBaseLoginResponse extends HFResponse {

    @ApiField("data")
    private AccessToken accessToken;

    public AccessToken getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(AccessToken accessToken) {
        this.accessToken = accessToken;
    }
}
