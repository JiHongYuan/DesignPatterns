package c21单例模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/4/2221:46
 */
public class Main {
    /**
     *  饿汉 就是类加载时候直接初始化
     *  懒汉 类被调用getInstance才初始化
     * */
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}
