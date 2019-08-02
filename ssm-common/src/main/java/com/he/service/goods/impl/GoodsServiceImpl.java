package com.he.service.goods.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.he.mapper.goods.GoodsMapper;
import com.he.model.goods.GoodsModel;
import com.he.service.goods.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, GoodsModel> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;


    public GoodsModel findByMap(int id) { return goodsMapper.findByMap(id); }

}
