package cn.sang.dao;

import cn.sang.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept findById(Long Id);

    public List<Dept> findAll();

}
