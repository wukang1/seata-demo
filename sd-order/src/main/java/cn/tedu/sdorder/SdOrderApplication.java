package cn.tedu.sdorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @Title: SdOrderApplication
 * @Package cn.tedu.sdorder
 * @Description: 订单启动类
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("cn.tedu.sdorder.mapper")
public class SdOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdOrderApplication.class, args);
    }

}
