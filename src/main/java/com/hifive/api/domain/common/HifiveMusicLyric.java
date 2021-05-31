package com.hifive.api.domain.common;

import com.hifive.api.internal.mapping.ApiField;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 艺人
 */
@AllArgsConstructor
@NoArgsConstructor
public class HifiveMusicLyric implements Serializable {

    /**
     * 动态歌词
     */
    @ApiField("dynamicUrl")
    private String dynamicUrl;

    /**
     * 静态歌词
     */
    @ApiField("staticUrl")
    private String staticUrl;

    public String getDynamicUrl() {
        return dynamicUrl;
    }

    public void setDynamicUrl(String dynamicUrl) {
        this.dynamicUrl = dynamicUrl;
    }

    public String getStaticUrl() {
        return staticUrl;
    }

    public void setStaticUrl(String staticUrl) {
        this.staticUrl = staticUrl;
    }
}
