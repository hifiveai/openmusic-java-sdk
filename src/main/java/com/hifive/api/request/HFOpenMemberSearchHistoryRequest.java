package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFOpenMemberSearchHistoryResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:16:10
 **/
public class HFOpenMemberSearchHistoryRequest extends HFPageRequest<HFOpenMemberSearchHistoryResponse> {
    @Override
    public String getApiMethodName() {
        return "OpenMemberSearchHistory";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("Page", getPage());
                put("PageSize", getPageSize());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFOpenMemberSearchHistoryResponse> getResponseClass() {
        return HFOpenMemberSearchHistoryResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }
}
