package cn.tedu.sdorder.controller;

import cn.tedu.sdorder.entity.Order;
import cn.tedu.sdorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Title: OrderController
 * @Package cn.tedu.sdorder.controller
 * @Description: 订单controller
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;


    /**
     * 生成订单
     * 用户用这个路径进行访问：http://localhost:8083/create?userId=1&productId=1&count=10&money=100
     * @param order
     * @return
     */
    @PostMapping("/create")
    public String create(Order order) {
        orderService.create(order);
        return "create order success";
    }
}
