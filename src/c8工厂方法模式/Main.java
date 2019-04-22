package c8工厂方法模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/3/721:33
 */
public class Main {
    /**
     * http://www.cnblogs.com/zuoxiaolong/p/pattern5.html
     * 维护性加强了 比简单工厂 不用做太大的改动
     *
     * 简单工厂模式：内部存在逻辑 通过传入参数 根据参数创建不同的对象返回
     * 工厂方法模式：内部没有逻辑， 需要使用者判断逻辑 并且选择需要创建的子类。
     * */
    public static void main(String[] args) {
        IFactory factory = new OperationAddFactory();
        Operation operation = factory.createOperation();
        operation.setNumberA(1.0);
        operation.setNumberB(2.0);
        System.out.println(operation.getResult());
    }
}
