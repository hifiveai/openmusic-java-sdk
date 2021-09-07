package com.hifive.api.domain;
import com.hifive.api.internal.mapping.ApiField;

import java.io.Serializable;

/**
 * @author meiyang
 * @version 1.0
 **/

public class SubVersion implements Serializable {
    /**
     * 版本名称
     */
    @ApiField("versionName")
    String versionName;
    /**
     * 歌曲路径
     */
    @ApiField("path")
    String path;
    /**
     * 波形图路径
     */
    @ApiField("wavePath")
    String wavePath;
    /**
     * 相对父歌开始时间
     */
    @ApiField("startTime")
    Integer startTime;
    /**
     * 相对父歌结束时间
     */
    @ApiField("endTime")
    Integer endTime;

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getWavePath() {
        return wavePath;
    }

    public void setWavePath(String wavePath) {
        this.wavePath = wavePath;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
}
