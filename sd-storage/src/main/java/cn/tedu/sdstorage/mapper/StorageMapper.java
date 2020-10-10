package cn.tedu.sdstorage.mapper;

import cn.tedu.sdstorage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
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
    void decrease(@Param("productId") Long productId,
                  @Param("count") Integer count);

    /**
     * 根据商品id查询单个商品
     * @param productId
     * @return
     */
    Storage selectStorageByProductId(@Param("productId") Long productId);
}
