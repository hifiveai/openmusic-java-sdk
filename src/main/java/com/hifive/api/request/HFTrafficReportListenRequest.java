package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFTrafficReportListenResponse;

import java.util.Map;

public class HFTrafficReportListenRequest extends HFBaseRequest<HFTrafficReportListenResponse> {


    /**
     * 音乐id
     **/
    private String musicId;

    /**
     * 音频格式 文件编码,默认mp3 可选(mp3 / aac)
     */
    private String audioFormat;

    /**
     * 音频码率 音质，音乐播放时的比特率，默认320 可选(320 / 128)
     */
    private String audioRate;

    /**
     * 播放时间，13位毫秒级时间戳
     */
    private Long timestamp;

    /**
     * 播放时长
     */
    private Long duration;

    @Override
    public String getApiMethodName() {
        return "TrafficReportListen";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("musicId", getMusicId());
                put("audioFormat", getAudioFormat());
                put("audioRate", getAudioRate());
                put("timestamp", getTimestamp());
                put("duration", getDuration());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFTrafficReportListenResponse> getResponseClass() {
        return HFTrafficReportListenResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    public String getAudioRate() {
        return audioRate;
    }

    public void setAudioRate(String audioRate) {
        this.audioRate = audioRate;
    }

    @Override
    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}
