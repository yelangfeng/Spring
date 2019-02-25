package cn.csdas.yelf.ioc.zhujie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

//@Component("master")
//@Service("master")
//@Repository("master")
@Controller("master")  //相当于<bean id="master" class="Master"/>
public class Master {
    @Value("小明")  //<property name="name" value="小明"/>
    private String name;

    //@Autowired()  //方式1：按照【类型】注入

    /*@Autowired
    @Qualifier("dog")*/ //方式2：按照【名称】注入1

    @Resource(name="dog")  //方式3：按照【名称】注入2
    private Dog dog;        //<property name="dog" ref="dog"/>

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
