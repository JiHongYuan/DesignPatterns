package c21单例模式;

/**
 * @author jiHongYuan
 * @Title: Singleton
 * @ProjectName 大话设计模式
 * @date 2019/4/2221:45
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance(){

        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
