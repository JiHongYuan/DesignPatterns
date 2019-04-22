package c7代理模式;

/**
 * @author jiHongYuan
 * @Title: RealSubject
 * @ProjectName 大话设计模式
 * @date 2019/3/721:04
 */
public class RealSubject extends Subject{
    @Override
    public void f() {
        System.out.println("RealSubject.f()");
    }
}
