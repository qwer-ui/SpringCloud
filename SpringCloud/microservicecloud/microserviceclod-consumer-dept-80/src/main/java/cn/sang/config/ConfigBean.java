package cn.sang.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//用于访问Rest服务的客户端模板工具类
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //SpringCloud Ribbon是基于Neetflix Ribbon实现的一套客户端负载均衡工具
    public RestTemplate getRestTenplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //return new RoundRobinRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询
        return new RandomRule();//随机
    }

}
