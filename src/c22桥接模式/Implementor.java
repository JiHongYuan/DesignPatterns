package c22桥接模式;

/**
 * @author jiHongYuan
 * @Title: Implementor
 * @ProjectName DesignPatterns
 * @date 2019/4/239:50
 */
public abstract class Implementor {
    public abstract void operation();
}

class ConcreteImplementorA extends Implementor{

    @Override
    public void operation() {
        System.out.println("ConcreteImplementorA.operation()");
    }
}

class ConcreteImplementorB extends Implementor{

    @Override
    public void operation() {
        System.out.println("ConcreteImplementorB.operation()");
    }
}