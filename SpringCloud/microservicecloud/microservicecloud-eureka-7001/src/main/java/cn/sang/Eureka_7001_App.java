package cn.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启动该EurekaServer组件技术的相关注解标签
public class Eureka_7001_App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7001_App.class,args);
    }
}
