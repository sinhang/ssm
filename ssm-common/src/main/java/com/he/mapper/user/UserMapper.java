package com.he.mapper.user;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.he.model.user.UserModel;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


//@Mapper
@Repository
public interface UserMapper extends BaseMapper<UserModel> {

    UserModel findByMap(@Param("id") Integer id);

    @Select("SELECT * FROM `zr_user` WHERE user_id=#{user_id}")
    UserModel selectBySuper(@Param("user_id") Integer user_id);

    @Insert("INSERT INTO `zr_user` (create_time) values(now)")
    int insertBySuper(UserModel userModel);

    @Update("UPDATE `zr_user` SET `create_time` = now WHERE `user_id`=#{user_id}")
    int updateBySuper(UserModel userModel);

}
