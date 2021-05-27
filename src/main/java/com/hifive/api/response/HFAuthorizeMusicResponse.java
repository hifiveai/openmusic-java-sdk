package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.HFAuthorizeMusicDetail;
import com.hifive.api.domain.common.HFMusicInfoDetail;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.domain.common.TagPrice;
import com.hifive.api.internal.mapping.ApiField;

/**
 * 分页。
 *
 * @author yong.huang
 * @since 1.0, Sep 12, 2009
 */
public class HFAuthorizeMusicResponse extends HFResponse {

    @ApiField("data")
    HifivePage<HFAuthorizeMusicDetail> hifivePage;

    public HifivePage<HFAuthorizeMusicDetail> getHifivePage() {
        return hifivePage;
    }

    public void setHifivePage(HifivePage<HFAuthorizeMusicDetail> hifivePage) {
        this.hifivePage = hifivePage;
    }
}
