package com.kaiz.user.service.interfaces;

import com.kaiz.user.pojo.vo.UserVO;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 15:52 2019/3/31.
 */
public interface IUserSV {
    UserVO getUserById(Integer userId);
}
