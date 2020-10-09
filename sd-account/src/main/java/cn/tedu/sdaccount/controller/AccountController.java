package cn.tedu.sdaccount.controller;

import cn.tedu.sdaccount.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


/**
 * @Title: AccountController
 * @Package cn.tedu.sdaccount.controller
 * @Description: 账户信息controller
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@RestController
@Slf4j
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     * @return
     */
    @GetMapping("/decrease")
    public String decrease(Long userId, BigDecimal money) {
        accountService.decrease(userId,money);
        return "user money decrease success";
    }
}
