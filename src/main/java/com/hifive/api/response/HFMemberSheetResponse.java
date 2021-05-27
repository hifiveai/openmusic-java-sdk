package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.HFMusicInfoDetail;
import com.hifive.api.domain.common.HifiveLiveApiPage;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.domain.common.MemberSheet;
import com.hifive.api.internal.mapping.ApiField;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:13:43
 **/
public class HFMemberSheetResponse extends HFResponse {



    @ApiField("data")
    HifiveLiveApiPage<MemberSheet> hifiveLiveApiPage;


    public HifiveLiveApiPage<MemberSheet> getHifiveLiveApiPage() {
        return hifiveLiveApiPage;
    }

    public void setHifiveLiveApiPage(HifiveLiveApiPage<MemberSheet> hifiveLiveApiPage) {
        this.hifiveLiveApiPage = hifiveLiveApiPage;
    }

}
