package com.he.service.goods;

import com.baomidou.mybatisplus.service.IService;
import com.he.model.goods.GoodsModel;
import org.springframework.stereotype.Service;


public interface IGoodsService extends IService<GoodsModel> {

    GoodsModel findByMap(int id);

}
