package cn.csdas.yelf.ioc.property;

public class Employee {
    private String name;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString(){
        return this.name+":"+this.car.getName();
    }
}
