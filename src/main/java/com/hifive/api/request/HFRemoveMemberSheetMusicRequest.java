package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFRemoveMemberSheetMusicResponse;

import java.util.List;
import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 **/
public class HFRemoveMemberSheetMusicRequest extends HFBaseRequest<HFRemoveMemberSheetMusicResponse> {
    /**
     * 接口token
     */
    private String accessToken;
    /**
     * 歌单Id
     */
    private Long sheetId;

    /**
     * 音乐Id
     */
    private List<String> musicId;

    @Override
    public String getApiMethodName() {
        return "RemoveMemberSheetMusic";
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
    public Class<HFRemoveMemberSheetMusicResponse> getResponseClass() {
        return HFRemoveMemberSheetMusicResponse.class;
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

    public List<String> getMusicId() {
        return musicId;
    }

    public void setMusicId(List<String> musicId) {
        this.musicId = musicId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
