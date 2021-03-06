package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFCreateMemberSheetResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 **/
public class HFCreateMemberSheetRequest extends HFBaseRequest<HFCreateMemberSheetResponse> {

    /**
     * 接口token
     */
    private String accessToken;
    /**
     * 歌单名称
     */
    private String sheetName;

    @Override
    public String getApiMethodName() {
        return "CreateMemberSheet";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("sheetName", getSheetName());
                put("accessToken", getAccessToken());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFCreateMemberSheetResponse> getResponseClass() {
        return HFCreateMemberSheetResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
