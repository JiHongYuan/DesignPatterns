package c15抽象工厂;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/4/1822:27
 */
public class Main {
    /**
     *  抽象工厂模式：提供一个创建一系列相关或互相依赖的对象接口，而无需指定他们的具体类型。
     *
     */
    public static void main(String[] args) {
        User user = new User();
        IFactory factory = new MysqlFactory();
        IUser iUser = factory.createUser();
        iUser.insert(user);
        iUser.getUser(1);
    }
}
