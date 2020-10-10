package cn.tedu.sdeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @Title: SdEurekaApplication
 * @Package cn.tedu.sdeureka
 * @Description: 注册证中心启动类
 * @author wukang
 * @date 2020/10/10
 * @version V1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class SdEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdEurekaApplication.class, args);
    }

}
