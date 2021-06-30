package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFAuthorizeMusicDetailResponse;
import com.hifive.api.response.HFTrialResponse;

import java.util.List;
import java.util.Map;

public class HFAuthorizeMusicDetailRequest extends HFBaseRequest<HFAuthorizeMusicDetailResponse> {

    /**
     * 音乐id
     **/
    private String musicIds;

    @Override
    public String getApiMethodName() {
        return "AuthorizeMusicDetail";
    }

    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("musicIds", getMusicIds());
            }
        };
        return txtParams;
    }

    public String getMusicIds() {
        return musicIds;
    }

    public void setMusicIds(String musicIds) {
        this.musicIds = musicIds;
    }

    public Class<HFAuthorizeMusicDetailResponse> getResponseClass() {
        return HFAuthorizeMusicDetailResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }


    @Override
    public void putOtherTextParam(String key, String value) {

    }
}
