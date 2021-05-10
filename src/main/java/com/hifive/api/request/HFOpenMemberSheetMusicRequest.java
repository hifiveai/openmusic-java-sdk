package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.response.HFOpenMemberSheetMusicDeleteResponse;
import com.hifive.api.response.HFOpenMemberSheetMusicResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:15:20
 **/
public class HFOpenMemberSheetMusicRequest extends HFBaseRequest<HFOpenMemberSheetMusicResponse>{
    @Override
    public String getApiMethodName() {
        return "OpenMemberSheetMusic";
    }

    @Override
    public Map<String, String> getTextParams() {
        return null;
    }

    @Override
    public Class<HFOpenMemberSheetMusicResponse> getResponseClass() {
        return null;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }
}
