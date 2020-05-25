package cn.tedu.sdorder.service;

import cn.tedu.sdorder.entity.Order;
import cn.tedu.sdorder.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void create(Order order) {
        orderMapper.create(order);
        //TODO: 修改库存
        //TODO: 缓存
    }
}
