package cn.csdas.yelf.ioc.zhujie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dog")  //相当于<bean id="dog" class="Dog"/>
public class Dog implements Aminal {
    @Value("旺财")
    private String name;
    @Value("黑色")
    private String color;

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
    public String cry(){
        return "汪汪汪！";
    }
}
