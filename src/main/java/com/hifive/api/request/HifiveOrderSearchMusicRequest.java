package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HifiveOrderSearchMusicResponse;
import com.hifive.api.response.HifiveSearchMusicResponse;

import java.util.Map;

public class HifiveOrderSearchMusicRequest extends HifivePageRequest<HifiveOrderSearchMusicResponse> {


    private String keyword;

    /**
     * 标签、歌单名、歌名语言版本，英文版本数据可能空
     */
    private Integer language;



    @Override
    public String getApiMethodName() {
        return "OrderSearchMusic";
    }


    @Override
    public Long getTimestamp() {
        return null;
    }

    @Override
    public void setTimestamp(Long timestamp) {

    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }


    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("keyword", getKeyword());
                put("language", getLanguage());
                put("Page", getPage());
                put("PageSize", getPageSize());
            }
        };
        return txtParams;
    }


    public Class<HifiveOrderSearchMusicResponse> getResponseClass() {
        return HifiveOrderSearchMusicResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }


    @Override
    public void putOtherTextParam(String key, String value) {

    }
}
