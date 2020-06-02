package cn.tedu.sdorder.service;

import cn.tedu.sdorder.entity.Order;
import cn.tedu.sdorder.feign.AccountClient;
import cn.tedu.sdorder.feign.StorageClient;
import cn.tedu.sdorder.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private AccountClient accountClient;
    @Autowired
    private StorageClient storageClient;

    @Override
    public void create(Order order) {
        orderMapper.create(order);

        // 修改库存
        storageClient.decrease(order.getProductId(), order.getCount());

        // 修改账户余额
        accountClient.decrease(order.getUserId(), order.getMoney());

    }
}