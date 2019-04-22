package c15抽象工厂;

/**
 * @author jiHongYuan
 * @Title: IFactory
 * @ProjectName 大话设计模式
 * @date 2019/4/1822:22
 */
public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}

class SqlserverFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}

class MysqlFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MysqlDepartment();
    }
}