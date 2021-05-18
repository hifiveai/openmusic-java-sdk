package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFOpenMemberSheetMusicAddResponse;

import java.util.List;
import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:14:56
 **/
public class HFOpenMemberSheetMusicAddRequest extends HFBaseRequest<HFOpenMemberSheetMusicAddResponse> {
    /**
     * 接口token
     */
    private String accessToken;
    /**
     * 歌单ID
     */
    private Long sheetId;

    /**
     * 音乐ID列表
     */
    private String musicId;

    @Override
    public String getApiMethodName() {
        return "OpenMemberSheetMusicAdd";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("sheetId", getSheetId());
                put("musicId", getMusicId());
                put("accessToken", getAccessToken());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFOpenMemberSheetMusicAddResponse> getResponseClass() {
        return HFOpenMemberSheetMusicAddResponse.class;
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


    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
