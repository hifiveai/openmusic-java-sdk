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
     * 歌单ID
     */
    private Long sheetId;

    /**
     * 音乐ID列表
     */
    private List<String> musicId;

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
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFOpenMemberSheetMusicAddResponse> getResponseClass() {
        return null;
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
}
