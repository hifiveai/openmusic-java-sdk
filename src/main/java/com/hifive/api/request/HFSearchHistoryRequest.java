package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFSearchHistoryResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 **/
public class HFSearchHistoryRequest extends HFPageRequest<HFSearchHistoryResponse> {

    /**
     * 接口token
     */
    private String accessToken;

    @Override
    public String getApiMethodName() {
        return "SearchHistory";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("Page", getPage());
                put("PageSize", getPageSize());
                put("accessToken", getAccessToken());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFSearchHistoryResponse> getResponseClass() {
        return HFSearchHistoryResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
