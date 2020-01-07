package cn.sang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@SuppressWarnings("serial")//序列化如果没有就会标黄
@AllArgsConstructor//使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@NoArgsConstructor//使用后创建一个无参构造函数
@Data //不用再去手写Getter,Setter,equals,canEqual,hasCode,toString等方法了
@Accessors(chain = true)//链式操作
public class Dept implements Serializable {
    private Long deptno; //主键
    private String dname;//部门名称
    private String db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一信息存储在不同的数据库中
}
