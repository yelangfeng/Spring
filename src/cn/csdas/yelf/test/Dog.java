package cn.csdas.yelf.test;

import org.springframework.stereotype.Controller;

@Controller("dog")
public class Dog implements Animal {
    private String name;
    private String color;
    private Host host;

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
                ", host=" + host +
                '}';
    }

    public void setHost(Host host) {
        this.host = host;
    }
}
