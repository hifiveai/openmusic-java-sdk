package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFOpenMemberSheetMusicResponse;
import com.hifive.api.response.HFOpenMemberSheetResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:13:43
 **/
public class HFOpenMemberSheetRequest extends HFPageRequest<HFOpenMemberSheetResponse>{

    private String memberOutId;

    private String accessToken;

    @Override
    public String getApiMethodName() {
        return "OpenMemberSheet";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("Page", getPage());
                put("PageSize", getPageSize());
                put("memberOutId",getMemberOutId());
                put("accessToken",getAccessToken());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFOpenMemberSheetResponse> getResponseClass() {
        return HFOpenMemberSheetResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

    public String getMemberOutId() {
        return memberOutId;
    }

    public void setMemberOutId(String memberOutId) {
        this.memberOutId = memberOutId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
