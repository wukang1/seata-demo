package cn.tedu.sdorder.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;


/**
 * @Title: AccountClient
 * @Package cn.tedu.sdorder.feign
 * @Description: 远程调用操作账户
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@FeignClient(name = "sd-account")
public interface AccountClient {

    /**
     * 远程调用扣减账户余额
     * @param userId
     * @param money
     * @return
     */
    @PostMapping("/decrease")
    String decrease(@RequestParam Long userId, @RequestParam BigDecimal money);
}
