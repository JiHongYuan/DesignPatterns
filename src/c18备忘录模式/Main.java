package c18备忘录模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/4/2216:02
 */
public class Main {
    /**
     *  备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
     *  这样以后就可以将该对象恢复到原先保存的状态。
     *
     *  一共有三个类：
     *      1. Originator 发起者 就是使用的一方
     *      2. Memento 备忘录  主体部分 存储数据类型
     *      3. Caretaker 保存备忘录
     * */
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("Off");
        o.show();

        o.setMemento(c.getMemento());
        o.show();
    }
}
