package com.personal_pj.passbook.service;

import com.personal_pj.passbook.vo.GainPassTemplateRequest;
import com.personal_pj.passbook.vo.Response;

/**
 * <h1>用户领取优惠券功能实现</h1>
 * Created by Shawn Yang.
 */
public interface IGainPassTemplateService {

    /**
     * <h2>用户领取优惠券</h2>
     * @param request {@link GainPassTemplateRequest}
     * @return {@link Response}
     * */
    Response gainPassTemplate(GainPassTemplateRequest request) throws Exception;
}
