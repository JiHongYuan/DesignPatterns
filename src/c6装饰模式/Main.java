package c6装饰模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/3/717:02
 */
public class Main {
    /**
     *  http://www.cnblogs.com/zuoxiaolong/p/pattern11.html
     *  复习地址
     *  装饰 通过组合 感觉像穿在一起
     *  通过一个最顶层的接口或者抽象类
     *  还有一个装饰类直接实现最顶层的东西
     *  在创建一个和最上层组合的装饰类，创建对象和方便其他类继承
     *  然后穿起来的感觉
     *
     *  感觉用的比较少？？？？？？
     *
     * */

    public static void main(String[] args) {
        ConcreteDecorator c = new ConcreteDecorator();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        // 有点像链式
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.Operation();
    }
}
