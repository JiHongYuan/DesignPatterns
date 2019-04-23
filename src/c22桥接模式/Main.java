package c22桥接模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName DesignPatterns
 * @date 2019/4/239:50
 */
public class Main {
    /**
     *  桥接模式:将抽象部分与它的实现部分分离，使它们都可以独立地变化。
     */
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();

    }
}
