package cn.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka_7003_App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7003_App.class);
    }
}
