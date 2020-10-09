package cn.tedu.sdstorage.mapper;

import cn.tedu.sdstorage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;


/**
 * @Title: StorageMapper
 * @Package cn.tedu.sdstorage.mapper
 * @Description: 库存mapper操作类
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@Repository
public interface StorageMapper extends BaseMapper<Storage> {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);
}
