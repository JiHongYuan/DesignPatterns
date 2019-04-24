package c26享元模式;

/**
 * @author jiHongYuan
 * @Title: Flyweight
 * @ProjectName DesignPatterns
 * @date 2019/4/2411:17
 */
public abstract class Flyweight {
    public abstract void operation(int extrinsicstate);
}

class ConcreteFlyweight extends Flyweight{

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("ConcreteFlyweight.operation() " + extrinsicstate);
    }
}

class UnsharedConcreteFlyweight extends Flyweight{

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("UnsharedConcreteFlyweight.operation() " + extrinsicstate);
    }
}