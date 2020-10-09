package cn.tedu.sdstorage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * @Title: SdStorageApplication
 * @Package cn.tedu.sdstorage
 * @Description: 库存启动类
 * @author wukang
 * @date 2020/10/9
 * @version V1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("cn.tedu.sdstorage.mapper")
public class SdStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdStorageApplication.class, args);
    }

}
