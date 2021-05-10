package com.hifive.api.domain.common;

import java.io.Serializable;

/**
 * 会员歌单
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 17:01:28
 **/
public class MemberSheet implements Serializable {

    /**
     * Id
     */
    private Long sheetId;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 名称
     */
    private String sheetName;

    /**
     * 创建时间
     */
    private String createTime;

    public Long getSheetId() {
        return sheetId;
    }

    public void setSheetId(Long sheetId) {
        this.sheetId = sheetId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
