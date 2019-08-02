package com.he.service.user;

import com.baomidou.mybatisplus.service.IService;
import com.he.model.user.UserModel;
import org.springframework.stereotype.Service;


public interface IUserService extends IService<UserModel> {

    UserModel findByMap(int id);
}
