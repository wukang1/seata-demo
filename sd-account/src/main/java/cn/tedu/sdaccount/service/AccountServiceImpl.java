package cn.tedu.sdaccount.service;

import cn.tedu.sdaccount.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
 * @Title: AccountServiceImpl
 * @Package cn.tedu.sdaccount.service
 * @Description: (用一句话描述)
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        accountMapper.decrease(userId,money);
    }
}
