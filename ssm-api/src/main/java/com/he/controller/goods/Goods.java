package com.he.controller.goods;

import com.he.mapper.user.UserMapper;
import com.he.model.goods.GoodsModel;
import com.he.model.user.UserModel;
import com.he.service.goods.IGoodsService;
import com.he.service.user.IUserService;
import com.he.utils.Response;
import com.he.utils.Sign;
import com.he.utils.constant.Const;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * 商品
 */
//@Api
@RestController
@Slf4j
public class Goods {

    @Autowired
    private IUserService userService;
    @Autowired
    private UserMapper userMapper;
    private UserModel userModel;
    @Autowired
    private IGoodsService goodsService;

    private GoodsModel goodsModel;

    @ResponseBody
    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public String get(HttpServletRequest request) {
        log.info("params: {} ", request.getParameterMap());
        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String paramsName = parameterNames.nextElement();
            log.info("params name: {}", paramsName);
            String[] parasValue = request.getParameterValues(paramsName);
            log.info("params value: {}", parasValue);
        }

        log.info("const: {}", Const.ORDERS_DELETE);

        log.info("sign: {}", Sign.getInstance().generateSign(request, "1.0.1", 1));

        userService.findByMap(1);
        GoodsModel goodsModel = goodsService.findByMap(1);
        log.info("goods_id: {}", goodsModel.getGoods_id());


        UserModel user = userMapper.findByMap(2);



        return Response.json();
    }

    @ResponseBody
    @RequestMapping(value = "/goods", method = RequestMethod.PUT)
    public String put(HttpServletRequest request) {
        return "put goods";
    }


    @ResponseBody
    @RequestMapping(value = "/goods/update", method = RequestMethod.POST)
    public String update(HttpServletRequest request) {
        return "update";
    }

}
