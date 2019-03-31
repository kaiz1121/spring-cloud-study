package com.kaiz.user.controller;

import com.kaiz.user.pojo.vo.UserVO;
import com.kaiz.user.service.interfaces.IUserSV;
import com.kaiz.user.utils.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 15:54 2019/3/31.
 */
@RestController
public class UserController {
    @Autowired
    private IUserSV iUserSV;

    @GetMapping(value = "/users/{userId}")
    public UserVO getUser(@PathVariable Integer userId){
        return iUserSV.getUserById(userId);
    }
}
