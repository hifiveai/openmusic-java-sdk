package com.hifive.api.domain.common;

import java.io.Serializable;

/**
 * 搜索记录
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 16:41:37
 **/
public class SearchRecord implements Serializable {

    /**
     * 搜索Id
     */
    private Long searchId;

    /**
     * 搜索关键字
     */
    private String keyword;

    /**
     * 搜索时间
     */
    private String createTime;

    public Long getSearchId() {
        return searchId;
    }

    public void setSearchId(Long searchId) {
        this.searchId = searchId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
