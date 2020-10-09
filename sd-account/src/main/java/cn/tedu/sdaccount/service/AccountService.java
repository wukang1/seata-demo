package cn.tedu.sdaccount.service;

import java.math.BigDecimal;


/**
 * @Title: AccountService
 * @Package cn.tedu.sdaccount.service
 * @Description: 账户信息service
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(Long userId, BigDecimal money);
}
