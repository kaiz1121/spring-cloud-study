package com.kaiz.user.service.impl;

import com.kaiz.user.dao.UserDao;
import com.kaiz.user.pojo.po.UserPO;
import com.kaiz.user.pojo.vo.UserVO;
import com.kaiz.user.service.interfaces.IUserSV;
import com.kaiz.user.utils.BeanMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 15:53 2019/3/31.
 */
@Service
@Transactional
public class UserSVImpl implements IUserSV{
    @Autowired
    private UserDao userDao;

    @Override
    public UserVO getUserById(Integer userId){
        UserPO userPO = userDao.getOne(userId);
        if (null !=userPO){
            return BeanMapperUtil.map(userPO,UserVO.class);
        }
        return null;
    }
}
