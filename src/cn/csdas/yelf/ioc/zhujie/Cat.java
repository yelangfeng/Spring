package cn.csdas.yelf.ioc.zhujie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("cat")  //    <bean id="cat" class="cn.csdas.yelf.ioc.zhujie.Cat" scope="singleton" init-method="init" destroy-method="destroy"/>
@Scope("singleton")    //scope="singleton"
public class Cat implements Aminal{
    @Value("小白")
    private String name;
    @Value("白色")
    private String color;

    @PostConstruct //init-method="init"
    public void init(){
        System.out.println("cat创建了。。。");
    }
    @PreDestroy  //destroy-method="destroy"
    public void destroy(){
        System.out.println("cat销毁了。。。");
    }

    @Override
    public String cry() {
        System.out.println("喵喵喵！");
        return "喵喵喵";
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
}
