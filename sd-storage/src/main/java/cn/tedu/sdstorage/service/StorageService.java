package cn.tedu.sdstorage.service;

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
