package cn.tedu.sdorder.mapper;

import cn.tedu.sdorder.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;


/**
 * @Title: OrderMapper
 * @Package cn.tedu.sdorder.mapper
 * @Description: 订单操作mapper
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@Repository
public interface OrderMapper extends BaseMapper {

    /**
     * 生成订单
     * @param order
     */
    void create(Order order);
}
