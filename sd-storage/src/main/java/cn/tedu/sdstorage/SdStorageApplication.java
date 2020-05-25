package cn.tedu.sdstorage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tedu.sdstorage.mapper")
public class SdStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdStorageApplication.class, args);
    }

}
