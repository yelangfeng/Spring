package cn.csdas.yelf.test;

import org.springframework.stereotype.Controller;

public class Dog implements Animal {
    private String name;
    private String color;
    private Host host;

    public Dog(){
        super();
    }

    public Dog(String name, String color, Host host) {
        this.name = name;
        this.color = color;
        this.host = host;
    }

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

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", host=" + host +
                '}';
    }
}
