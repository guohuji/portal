package com.neusoft.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.neusoft.portal.*.dao")
public class PortalApplication {

    /**
     * 软件工程系校园门户网站主启动类
     */
    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class, args);
    }

}
