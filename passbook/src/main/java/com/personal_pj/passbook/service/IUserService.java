package com.personal_pj.passbook.service;

import com.personal_pj.passbook.vo.Response;
import com.personal_pj.passbook.vo.User;

/**
 * <h1>用户服务: 创建 User 服务</h1>
 * Created by Shawn Yang.
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * @param user {@link User}
     * @return {@link Response}
     * */
    Response createUser(User user) throws Exception;
}
