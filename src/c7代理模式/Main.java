package c7代理模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/3/721:05
 */
public class Main {
    /**
     * http://www.cnblogs.com/zuoxiaolong/p/pattern3.html
     * 代理模式，为其他对象提供一种代理以控制对这个对象的访问。
     */
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.f();
    }
}
