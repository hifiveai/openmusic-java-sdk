package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.HFMusicInfoDetail;
import com.hifive.api.domain.common.HifiveLiveApiPage;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.domain.common.SearchRecord;
import com.hifive.api.internal.mapping.ApiField;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:16:10
 **/
public class HFSearchHistoryResponse extends HFResponse {

    @ApiField("data")
    private HifiveLiveApiPage<SearchRecord> hifiveLiveApiPage;


    public HifiveLiveApiPage<SearchRecord> getHifiveLiveApiPage() {
        return hifiveLiveApiPage;
    }

    public void setHifiveLiveApiPage(HifiveLiveApiPage<SearchRecord> hifiveLiveApiPage) {
        this.hifiveLiveApiPage = hifiveLiveApiPage;
    }
}
