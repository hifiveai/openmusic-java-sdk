package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFOpenMemberSheetMusicDeleteResponse;
import com.hifive.api.response.HFOpenMemberSheetMusicResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:15:20
 **/
public class HFOpenMemberSheetMusicRequest extends HFPageRequest<HFOpenMemberSheetMusicResponse>{


    /**
     * 歌单ID
     */
    private Long sheetId;

    /**
     * 0-中文,1-英文
     */
    private Integer language;

    @Override
    public String getApiMethodName() {
        return "OpenMemberSheetMusic";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("sheetId", getSheetId());
                put("musicId", getLanguage());
                put("Page", getPage());
                put("PageSize", getPageSize());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFOpenMemberSheetMusicResponse> getResponseClass() {
        return HFOpenMemberSheetMusicResponse.class;
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

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }
}
