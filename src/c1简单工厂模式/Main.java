package c1简单工厂模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/3/715:32
 */
public class Main {
    /**
     * 通过工厂模式创建 Operation 对象
     * 通过传入一个参数 获取到工厂创建的对象
     *
     * 通过一个类，来创建对象。
     * */
    public static void main(String[] args) {
        double numberA = 1;
        double numberB = 2;
        String o = "+";

        Operation operation = OperationFactory.createOperation(o);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        System.out.println(operation.getResult());
    }
}
