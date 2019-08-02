package com.he.model.goods;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Setter
@Getter
@TableName("zr_goods")
public class GoodsModel extends Model<GoodsModel> {

    private static final long serialVersionUID = 1L;


    @TableId
    private Integer goods_id;

    @Override
    protected Serializable pkVal() {
        return this.goods_id;
    }
}
