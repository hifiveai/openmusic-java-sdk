package com.hifive.api.domain.constants;

/**
 * @author meiyang
 * @version 1.0
 **/
public enum SearchFiledEnum {

    /**
     * 歌曲名称搜索
     */
    MUSIC("musicName"),
    /**
     * 专辑名称搜索
     */
    ALBUM("albumName"),
    /**
     * 艺人名称搜索
     */
    ARTIST("artistName"),
    /**
     * 标签名称搜索
     */
    TAG("tagName");

    String value;


    SearchFiledEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
