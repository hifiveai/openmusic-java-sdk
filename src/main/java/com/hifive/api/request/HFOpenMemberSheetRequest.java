package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.response.HFOpenMemberSheetMusicResponse;
import com.hifive.api.response.HFOpenMemberSheetResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:13:43
 **/
public class HFOpenMemberSheetRequest extends HFBaseRequest<HFOpenMemberSheetResponse>{
    @Override
    public String getApiMethodName() {
        return "OpenMemberSheet";
    }

    @Override
    public Map<String, String> getTextParams() {
        return null;
    }

    @Override
    public Class<HFOpenMemberSheetResponse> getResponseClass() {
        return null;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }
}
