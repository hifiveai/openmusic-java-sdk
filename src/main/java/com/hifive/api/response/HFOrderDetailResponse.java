package com.hifive.api.response;

import com.hifive.api.HFResponse;
import com.hifive.api.domain.common.Order;
import com.hifive.api.domain.common.OrderLyric;
import com.hifive.api.internal.mapping.ApiField;

/**
 * 分页。
 *
 * @author yong.huang
 * @since 1.0, Sep 12, 2009
 */
public class HFOrderDetailResponse extends HFResponse {

    @ApiField("data")
    OrderLyric order;


    public OrderLyric getOrder() {
        return order;
    }

    public void setOrder(OrderLyric order) {
        this.order = order;
    }
}
