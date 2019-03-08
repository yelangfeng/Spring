package cn.csdas.yelf.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("host")
public class Host {
    @Value("李四")
    private String name;
    @Value("50")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Host{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
