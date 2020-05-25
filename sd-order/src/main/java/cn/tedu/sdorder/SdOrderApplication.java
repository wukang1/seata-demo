package cn.tedu.sdorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tedu.sdorder.mapper")
public class SdOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdOrderApplication.class, args);
    }

}
