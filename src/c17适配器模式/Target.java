package c17适配器模式;

/**
 * @author jiHongYuan
 * @Title: Target
 * @ProjectName 大话设计模式
 * @date 2019/4/2215:54
 */
public interface Target {
    void request();
}

class Adaptee{
    void specificRequest(){
        System.out.println("特殊请求");
    }
}

class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}