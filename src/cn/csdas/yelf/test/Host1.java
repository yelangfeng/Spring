package cn.csdas.yelf.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("host1")
public class Host1 {
    @Value("李四")
    private String name;
    @Value("23")
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
