package cn.tedu.sdstorage.controller;

import cn.tedu.sdstorage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Title: StorageController
 * @Package cn.tedu.sdstorage.controller
 * @Description: 库存controller
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     * @throws Exception
     */
    @PostMapping("/decrease")
    public String decrease(Long productId, Integer count) throws Exception {
        storageService.decrease(productId,count);
        return "product decrease success";
    }

}
