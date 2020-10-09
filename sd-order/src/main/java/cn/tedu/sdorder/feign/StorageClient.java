package cn.tedu.sdorder.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @Title: StorageClient
 * @Package cn.tedu.sdorder.feign
 * @Description: 远程调用扣减库存
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@FeignClient(name = "sd-storage")
public interface StorageClient {

    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @GetMapping("/decrease")
    String decrease(@RequestParam Long productId, @RequestParam Integer count);
}