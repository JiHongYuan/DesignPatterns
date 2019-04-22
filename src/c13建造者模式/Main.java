package c13建造者模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/3/922:42
 */
public class Main {
    // 为什么感觉和策略模式差不多？？？？？

    /**
     *  我发现了 他的本质和工厂有点类似
     *  有点像工厂方法 把创建对象的工厂 换成了具体的业务
     *  工厂方法（业务归业务，工厂只负责创建那个业务类）
     *
     *  通过一个类或接口 抽象出一些物体的本质
     *  通过继承类来创建Product（这个点很重要，我刚开始就是没注意这个点和策略模式弄混了）
     *  在通过Director（指挥者）调用继承类重写父类的方法 （指挥者有点像代理模式，隐藏（封装）的逻辑
     *  ，调用的人只需要，new出需要构建的东西，通过指挥者调用重写的方法就可以返回对象）
     * */
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new People1Builder();
        Builder b2 = new People1Builder();
        director.construct(b1,"b1");
        director.construct(b2,"b2");
        System.out.println(b1.getPeople().toString());
        System.out.println(b2.getPeople().toString());
    }
}
