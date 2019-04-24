package c28访问者模式;

/**
 * @author jiHongYuan
 * @Title: Person
 * @ProjectName 大话设计模式
 * @date 2019/4/1722:20
 */
public abstract class Person {
    public abstract void accept(Action action);
}
