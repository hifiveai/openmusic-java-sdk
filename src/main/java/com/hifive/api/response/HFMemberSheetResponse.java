package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.HFMusicInfoDetail;
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
    HifivePage<MemberSheet> hifivePage;

    public HifivePage<MemberSheet> getHifivePage() {
        return hifivePage;
    }

    public void setHifivePage(HifivePage<MemberSheet> hifivePage) {
        this.hifivePage = hifivePage;
    }
}
