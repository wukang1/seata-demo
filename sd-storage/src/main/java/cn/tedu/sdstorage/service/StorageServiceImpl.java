package cn.tedu.sdstorage.service;

import cn.tedu.sdstorage.mapper.StorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Title: StorageServiceImpl
 * @Package cn.tedu.sdstorage.service
 * @Description: (用一句话描述)
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) throws Exception {
        storageMapper.decrease(productId,count);

        Thread.sleep(30000);
    }
}
