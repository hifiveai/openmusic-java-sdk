package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.HFAuthorizeMusicNoFileDetail;
import com.hifive.api.domain.common.HFMusicInfoDetail;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.internal.mapping.ApiField;
import com.hifive.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 分页。
 *
 * @author yong.huang
 * @since 1.0, Sep 12, 2009
 */
public class HFAuthorizeMusicDetailResponse extends HFResponse {

    @ApiListField("data")
    List<HFAuthorizeMusicNoFileDetail> authorizeMusicNoFileDetails;

    public List<HFAuthorizeMusicNoFileDetail> getAuthorizeMusicNoFileDetails() {
        return authorizeMusicNoFileDetails;
    }

    public void setAuthorizeMusicNoFileDetails(List<HFAuthorizeMusicNoFileDetail> authorizeMusicNoFileDetails) {
        this.authorizeMusicNoFileDetails = authorizeMusicNoFileDetails;
    }
}
