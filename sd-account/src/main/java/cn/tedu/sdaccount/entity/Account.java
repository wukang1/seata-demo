package cn.tedu.sdaccount.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


/**
 * @Title: Account
 * @Package cn.tedu.sdaccount.entity
 * @Description: 账户信息实体
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private Long id;
    private Long userId;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;
}

