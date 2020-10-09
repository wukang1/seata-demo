package cn.tedu.sdaccount.mapper;

import cn.tedu.sdaccount.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;


/**
 * @Title: AccountMapper
 * @Package cn.tedu.sdaccount.mapper
 * @Description: 账户信息mapper
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@Repository
public interface AccountMapper extends BaseMapper<Account> {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(Long userId, BigDecimal money);
}
