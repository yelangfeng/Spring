package cn.csdas.yelf.ioc.others;

public class UserDaoImpl implements UserDao {
    private String name;
    @Override
    public void save(){
        System.out.println("UserDaoImpl");
    }

    public UserDaoImpl() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("UserDaoImpl初始化...");
    }

    public void destroy(){
        System.out.println("UserDaoImpl关闭...");
    }
}
