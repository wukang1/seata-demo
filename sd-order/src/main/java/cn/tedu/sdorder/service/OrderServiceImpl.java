package cn.tedu.sdorder.service;

import cn.tedu.sdorder.entity.Order;
import cn.tedu.sdorder.feign.AccountClient;
import cn.tedu.sdorder.feign.StorageClient;
import cn.tedu.sdorder.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Title: OrderServiceImpl
 * @Package cn.tedu.sdorder.service
 * @Description: 订单业务逻辑层
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private AccountClient accountClient;
    @Autowired
    private StorageClient storageClient;


    @GlobalTransactional(name = "tx-tedu-create-order",rollbackFor = Exception.class)
    @Override
    public void create(Order order) {
        orderMapper.create(order);

        // 修改库存
        storageClient.decrease(order.getProductId(), order.getCount());

        // 修改账户余额
        accountClient.decrease(order.getUserId(), order.getMoney());

    }
}
