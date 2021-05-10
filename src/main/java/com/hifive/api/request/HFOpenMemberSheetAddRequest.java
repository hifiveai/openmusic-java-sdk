package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFOpenMemberSheetAddResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:14:14
 **/
public class HFOpenMemberSheetAddRequest extends HFBaseRequest<HFOpenMemberSheetAddResponse> {

    private String sheetName;

    @Override
    public String getApiMethodName() {
        return "OpenMemberSheetAdd";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("sheetName", getSheetName());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFOpenMemberSheetAddResponse> getResponseClass() {
        return null;
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
}
