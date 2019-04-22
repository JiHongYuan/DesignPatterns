package c12外观模式;

/**
 * @author jiHongYuan
 * @Title: Facade
 * @ProjectName 大话设计模式
 * @date 2019/3/922:13
 */
public class Facade {
    t1 t1;
    t2 t2;
    t3 t3;
    Facade(){
        t1 = new t1();
        t2 = new t2();
        t3 = new t3();
    }

    public void k(){
        t1.f();
        t2.f();
    }
    public void f(){
        t2.f();
        t3.f();
    }
}

class t1{
    void f(){
        System.out.println("t1.f()");
    }
}

class t2{
    void f(){
        System.out.println("t2.f()");
    }
}


class t3{
    void f(){
        System.out.println("t3.f()");
    }
}
