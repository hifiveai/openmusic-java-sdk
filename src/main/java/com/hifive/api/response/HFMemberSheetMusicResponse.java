package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.HFMusicInfoDetail;
import com.hifive.api.domain.common.HifiveLiveApiPage;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.internal.mapping.ApiField;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:15:20
 **/
public class HFMemberSheetMusicResponse extends HFResponse {



    @ApiField("data")
    HifiveLiveApiPage<HFMusicInfoDetail> hifiveLiveApiPage;

    public HifiveLiveApiPage<HFMusicInfoDetail> getHifiveLiveApiPage() {
        return hifiveLiveApiPage;
    }

    public void setHifiveLiveApiPage(HifiveLiveApiPage<HFMusicInfoDetail> hifiveLiveApiPage) {
        this.hifiveLiveApiPage = hifiveLiveApiPage;
    }



}
