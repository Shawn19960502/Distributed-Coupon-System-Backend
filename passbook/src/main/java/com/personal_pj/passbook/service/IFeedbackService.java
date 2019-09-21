package com.personal_pj.passbook.service;

import com.personal_pj.passbook.vo.Feedback;
import com.personal_pj.passbook.vo.Response;

/**
 * <h1>评论功能: 即用户评论相关功能实现</h1>
 * Created by Shawn Yang.
 */
public interface IFeedbackService {

    /**
     * <h2>创建评论</h2>
     * @param feedback {@link Feedback}
     * @return {@link Response}
     * */
    Response createFeedback(Feedback feedback);

    /**
     * <h2>获取用户评论</h2>
     * @param userId 用户 id
     * @return {@link Response}
     * */
    Response getFeedback(Long userId);
}
