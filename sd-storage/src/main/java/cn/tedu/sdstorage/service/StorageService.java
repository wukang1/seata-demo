package cn.tedu.sdstorage.service;


/**
 * @Title: StorageService
 * @Package cn.tedu.sdstorage.service
 * @Description: 库存service
 * @author wukang
 * @date 2020/10/10
 * @version V1.0
 */
public interface StorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     * @throws InterruptedException
     * @throws Exception
     */
    void decrease(Long productId, Integer count) throws InterruptedException, Exception;
}
