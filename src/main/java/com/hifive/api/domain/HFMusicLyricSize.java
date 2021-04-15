package com.hifive.api.domain;

import com.hifive.api.domain.common.base.HFBaseMusicSize;
import com.hifive.api.internal.mapping.ApiField;

/**
 * <p>
 * 企业用户 服务实现类
 * </p>
 *
 * @author yong.huang
 */
public class HFMusicLyricSize extends HFBaseMusicSize {

    /** 歌曲ID **/
    @ApiField("musicId")
    private String musicId;

    @ApiField("dynamicLyricUrl")
    private String dynamicLyricUrl;

    @ApiField("staticLyricUrl")
    private String staticLyricUrl;

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }

    public String getDynamicLyricUrl() {
        return dynamicLyricUrl;
    }

    public void setDynamicLyricUrl(String dynamicLyricUrl) {
        this.dynamicLyricUrl = dynamicLyricUrl;
    }

    public String getStaticLyricUrl() {
        return staticLyricUrl;
    }

    public void setStaticLyricUrl(String staticLyricUrl) {
        this.staticLyricUrl = staticLyricUrl;
    }
}
