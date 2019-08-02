package com.he.service.user.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.he.mapper.user.UserMapper;
import com.he.model.user.UserModel;
import com.he.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserModel> implements IUserService {

    @Autowired
    private UserMapper userMapper;

//    @Autowired
    public UserModel findByMap(int id) {
        return userMapper.findByMap(id);
    }

    public UserModel selectBySuper() {
        return null;
    }

    public int insertBySuper(UserModel userModel) {
        return 0;
    }

    public int updateBySuper(UserModel userModel) {
        return 0;
    }
}
