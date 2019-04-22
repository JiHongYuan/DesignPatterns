package c6装饰模式;

/**
 * @author jiHongYuan
 * @Title: ConcreateDecoratorA
 * @ProjectName 大话设计模式
 * @date 2019/3/717:00
 */
public class ConcreteDecoratorA extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        System.out.println("ConcreteDecoratorA.Operation()");
    }
}
