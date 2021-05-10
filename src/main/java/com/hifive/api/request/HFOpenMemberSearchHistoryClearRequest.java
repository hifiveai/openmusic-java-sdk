package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFOpenMemberSearchHistoryClearResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:16:26
 **/
public class HFOpenMemberSearchHistoryClearRequest extends HFBaseRequest<HFOpenMemberSearchHistoryClearResponse> {

    @Override
    public String getApiMethodName() {
        return "OpenMemberSearchHistoryClear";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFOpenMemberSearchHistoryClearResponse> getResponseClass() {
        return null;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
