package cn.sang.service;

import cn.sang.pojo.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//@FeignClient(name = "microservicecloud.dept")//标识对那一个微服务进行面向接口Feign的编码
@FeignClient(name = "microservicecloud.dept",fallbackFactory = DeptClientServiceFallbackFactory.class)//服务熔断
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();
    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);
}
