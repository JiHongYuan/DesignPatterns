package c14观察者模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/4/1821:52
 */
public class Main {
    /**
     * 当一个对象的改变需要同时改变其他对象的时候。
     */
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();

        s.attach(new ConcreteObserver("X",s));
        s.attach(new ConcreteObserver("Y",s));
        s.attach(new ConcreteObserver("Z",s));

        s.setSubjectState("ABC");
        s.mNotify();
    }
}
