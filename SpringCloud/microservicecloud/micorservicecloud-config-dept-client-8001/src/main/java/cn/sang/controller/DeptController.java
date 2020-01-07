package cn.sang.controller;

import cn.sang.pojo.Dept;
import cn.sang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        Dept dept = this.deptService.get(id);
                if(null == dept){
            throw new RuntimeException("该ID:"+id+"没有对应的信息");
                }
                return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("该ID:"+id+"没有对应的想，null--@HystrixCommand").setDb_source("no this database MySQL");
    }

}
