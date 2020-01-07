package cn.sang;

import config.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient//和Eureka进行整合
@RibbonClient(name = "microservicecloud.dept",configuration = MySelfRule.class)//定制负载均衡算法
public class Consumer_80_App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_80_App.class);
    }
}
