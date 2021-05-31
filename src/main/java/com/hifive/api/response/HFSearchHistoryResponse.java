package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.domain.common.SearchRecord;
import com.hifive.api.internal.mapping.ApiField;

/**
 * @author meiyang
 * @version 1.0
 **/
public class HFSearchHistoryResponse extends HFResponse {

    @ApiField("data")
    private HifivePage<SearchRecord> hifivePage;

    public HifivePage<SearchRecord> getHifivePage() {
        return hifivePage;
    }

    public void setHifivePage(HifivePage<SearchRecord> hifivePage) {
        this.hifivePage = hifivePage;
    }

}
