package com.hifive.api.domain.common;

import com.hifive.api.HFObject;
import com.hifive.api.internal.mapping.ApiField;
import com.hifive.api.internal.mapping.ApiListField;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class HifiveLiveApiPage<T> extends HFObject {
    @ApiListField("records")
    private List<T> records;

    /**
     * 总条数
     */
    @ApiField("totalCount")
    private Long totalCount;

    /**
     * 当前页
     */
    @ApiField("currentPage")
    private Long currentPage;

    /**
     * 每页条数
     */
    @ApiField("pageSize")
    private Long pageSize;

    @ApiField("totalPage")
    private Long totalPage;

    public HifiveLiveApiPage(){
        records = new ArrayList<>();
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }
}
