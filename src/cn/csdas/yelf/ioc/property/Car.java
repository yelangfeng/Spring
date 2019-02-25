package cn.csdas.yelf.ioc.property;

public class Car {
    private String name;
    private float price;
    public Car(String name,float price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return name+price;
    }
}
