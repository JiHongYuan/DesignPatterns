package c15抽象工厂;

/**
 * @author jiHongYuan
 * @Title: IDepartment
 * @ProjectName 大话设计模式
 * @date 2019/4/1822:29
 */
public interface IDepartment {
    void insert(Department department);

    Department getDepartment(int id);
}

class SqlserverDepartment implements IDepartment{

    @Override
    public void insert(Department department) {
        System.out.println("sql server insert into department");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("sql server select * from  department");
        return null;
    }
}

class MysqlDepartment implements IDepartment{

    @Override
    public void insert(Department department) {
        System.out.println("mysql insert into department");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("mysql select * from  department");
        return null;
    }
}