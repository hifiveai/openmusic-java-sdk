package com.hifive.api.domain.common;

import com.hifive.api.HFObject;
import com.hifive.api.internal.mapping.ApiField;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class HFMusicLyricFile extends HFObject {
    @ApiField("musicId")
    private String musicId;
    @ApiField("fileUrl")
    private String fileUrl;
    /**
     * 过期时间戳
     */
    @ApiField("expires")
    private Long expires;

    /**
     * 波形图地址
     */
    @ApiField("waveUrl")
    private String waveUrl;

    /**
     * 动态歌词地址
     */
    @ApiField("dynamicLyricUrl")
    private String dynamicLyricUrl;

    /**
     * 静态歌词地址
     */
    @ApiField("staticLyricUrl")
    private String staticLyricUrl;

    /**
     * 文件大小
     */
    @ApiField("fileSize")
    private Long fileSize;

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Long getExpires() {
        return expires;
    }

    public void setExpires(Long expires) {
        this.expires = expires;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getWaveUrl() {
        return waveUrl;
    }

    public void setWaveUrl(String waveUrl) {
        this.waveUrl = waveUrl;
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
