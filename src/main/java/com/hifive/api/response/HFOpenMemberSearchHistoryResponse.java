package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.domain.common.SearchRecord;
import com.hifive.api.internal.mapping.ApiField;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:16:10
 **/
public class HFOpenMemberSearchHistoryResponse  extends HFResponse {

    @ApiField("data")
    private HifivePage<SearchRecord> hifivePage;

    public HifivePage<SearchRecord> getHifivePage() {
        return hifivePage;
    }

    public void setHifivePage(HifivePage<SearchRecord> hifivePage) {
        this.hifivePage = hifivePage;
    }
}