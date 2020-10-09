package cn.tedu.sdorder.service;

import cn.tedu.sdorder.entity.Order;


/**
 * @Title: OrderService
 * @Package cn.tedu.sdorder.service
 * @Description: 订单service
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
public interface OrderService {

    /**
     * 生成订单
     * @param order
     */
    void create(Order order);
}
