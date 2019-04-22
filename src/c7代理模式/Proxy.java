package c7代理模式;

/**
 * @author jiHongYuan
 * @Title: Proxy
 * @ProjectName 大话设计模式
 * @date 2019/3/721:04
 */
public class Proxy extends Subject {
    private RealSubject realSubject;

    @Override
    public void f() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.f();
    }
}
