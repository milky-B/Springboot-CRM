package com.gdut.crm;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@SpringBootApplication
@MapperScan("com.gdut.crm.mapper")
/*@ImportResource(locations = "classpath:applicationContext-mapper.xml")*/
public class Bootstrap {
    public static void main(String[] args) {
        try {
            SpringApplication app = new SpringApplication(Bootstrap.class);
            app.run(args);
        } catch (Exception e) {
            log.error("启动失败", e);
            throw e;
        }
    }
}
