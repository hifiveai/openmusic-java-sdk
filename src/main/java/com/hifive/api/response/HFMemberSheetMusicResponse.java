package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.HFMusicInfoDetail;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.internal.mapping.ApiField;

/**
 * @author meiyang
 * @version 1.0
 **/
public class HFMemberSheetMusicResponse extends HFResponse {



    @ApiField("data")
    HifivePage<HFMusicInfoDetail> hifivePage;


    public HifivePage<HFMusicInfoDetail> getHifivePage() {
        return hifivePage;
    }

    public void setHifivePage(HifivePage<HFMusicInfoDetail> hifivePage) {
        this.hifivePage = hifivePage;
    }
}
