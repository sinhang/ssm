package com.he.model.user;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Getter
@Setter
@TableName("zr_user_address")
public class UserAddressModel extends Model<UserAddressModel> {

    private static final long serialVersionUID = 1L;

    @TableId
    private Integer address_id;

    @Override
    protected Serializable pkVal() {
        return this.address_id;
    }
}
