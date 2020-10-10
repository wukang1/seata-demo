package cn.tedu.sdstorage.service;

import cn.tedu.sdstorage.entity.Storage;
import cn.tedu.sdstorage.mapper.StorageMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Title: StorageServiceImpl
 * @Package cn.tedu.sdstorage.service
 * @Description: 库存service实现类
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@Service
public class StorageServiceImpl  implements StorageService {
    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) throws Exception {
        Storage storage = storageMapper.selectStorageByProductId(productId);
        if(storage.getResidue()-count<0){
            throw new Exception("库存不足");
        }
        storageMapper.decrease(productId,count);
//        Thread.sleep(30000);
    }
}
