package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFDeleteMemberSheetResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 **/
public class HFDeleteMemberSheetRequest extends HFBaseRequest<HFDeleteMemberSheetResponse> {
    /**
     * 接口token
     */
    private String accessToken;
    /**
     * 歌单ID
     */
    private Long sheetId;

    @Override
    public String getApiMethodName() {
        return "DeleteMemberSheet";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("sheetId", getSheetId());
                put("accessToken", getAccessToken());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFDeleteMemberSheetResponse> getResponseClass() {
        return HFDeleteMemberSheetResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

    public Long getSheetId() {
        return sheetId;
    }

    public void setSheetId(Long sheetId) {
        this.sheetId = sheetId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
