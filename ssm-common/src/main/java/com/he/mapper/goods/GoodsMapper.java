package com.he.mapper.goods;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.he.model.goods.GoodsModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface GoodsMapper extends BaseMapper<GoodsModel> {

    GoodsModel findByMap(@Param("id") int id);

}
