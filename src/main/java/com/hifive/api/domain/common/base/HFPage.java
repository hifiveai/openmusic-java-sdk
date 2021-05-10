package com.hifive.api.domain.common.base;

import com.hifive.api.HFObject;
import com.hifive.api.internal.mapping.ApiField;
import com.hifive.api.internal.mapping.ApiListField;

import java.util.ArrayList;
import java.util.List;

public class HFPage<T> extends HFObject {

    @ApiListField("records")
    private List<T> records;

    @ApiField("totalPage")
    private Long totalPage;

    @ApiField("totalCount")
    private Long totalCount;

    @ApiField("currentPage")
    private Long currentPage;

    @ApiField("pageSize")
    private Long pageSize;


    public HFPage() {
        records = new ArrayList<>();
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
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
}
