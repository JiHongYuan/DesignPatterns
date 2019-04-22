package c6装饰模式;

/**
 * @author jiHongYuan
 * @Title: ConcreteDecoratorB
 * @ProjectName 大话设计模式
 * @date 2019/3/717:01
 */
public class ConcreteDecoratorB extends Decorator{

    @Override
    public void Operation() {
        super.Operation();
        System.out.println("ConcreteDecoratorB.Operation()");
    }
}
