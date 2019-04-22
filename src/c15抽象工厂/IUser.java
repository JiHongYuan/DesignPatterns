package c15抽象工厂;

/**
 * @author jiHongYuan
 * @Title: IUser
 * @ProjectName 大话设计模式
 * @date 2019/4/1822:18
 */
public interface IUser {
    void insert(User user);

    void getUser(int id);
}

class SqlserverUser implements IUser{

    @Override
    public void insert(User user) {
        System.out.println("sql server insert into user");
    }

    @Override
    public void getUser(int id) {
        System.out.println("sql server select * from user");
    }
}

class MysqlUser implements IUser{

    @Override
    public void insert(User user) {
        System.out.println("mysql insert into user");
    }

    @Override
    public void getUser(int id) {
        System.out.println("mysql select * from user");
    }
}