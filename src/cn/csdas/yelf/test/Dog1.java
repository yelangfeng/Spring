package cn.csdas.yelf.test;

import cn.csdas.yelf.ioc.zhujie.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class Dog1 implements Animal {
    @Value("狗子")
    private String name;
    @Value("黄色")
    private String color;

    //@Autowired()  //方式1：按照【类型】注入

    /*@Autowired
    @Qualifier("dog")*/ //方式2：按照【名称】注入1

    //@Resource(name="dog")  //方式3：按照【名称】注入2
    //<property name="dog" ref="dog"/>

    @Autowired
    @Qualifier("host1")
    private Host1 host1;

    public void init(){
        System.out.println("对象创建了！");
    }

    public void destroy(){
        System.out.println("对象销毁了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", host1=" + host1 +
                '}';
    }

    public void setHost(Host1 host1) {
        this.host1 = host1;
    }
}
