package c10模板方法模式;

/**
 * @author jiHongYuan
 * @Title: AbstractClass
 * @ProjectName 大话设计模式
 * @date 2019/3/921:58
 */
public abstract class AbstractClass {
    public abstract void f();

    public void init() {
        f();
    }
}

class class1 extends AbstractClass {
    @Override
    public void f() {
        System.out.println("Class1.f()");
    }
}

class class2 extends AbstractClass {
    @Override
    public void f() {
        System.out.println("Class2.f()");
    }
}
