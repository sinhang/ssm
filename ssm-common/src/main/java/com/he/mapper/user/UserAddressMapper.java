package com.he.mapper.user;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.he.model.user.UserAddressModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UserAddressMapper extends BaseMapper<UserAddressModel> {
}
