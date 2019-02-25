package cn.csdas.yelf.ioc.zhujieandxml;

import cn.csdas.yelf.ioc.zhujie.Aminal;
import org.springframework.beans.factory.annotation.Value;

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
