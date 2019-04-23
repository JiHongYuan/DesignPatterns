package c25中介者模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName DesignPatterns
 * @date 2019/4/2321:44
 */
public class Main {
    /**
     * 中介者模式：用一个中介对象来封装一系列的对象交互。中介者使各对象
     * 不需要显式地互相引用，从而使其耦合松散，而且可以独立地改变他们之间的交互。
     *
     * 为什么我觉得有点像代理模式。
     * 双重代理模式
     * */

    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.send("吃过饭了吗？");
        c2.send("还没！");
    }
}
