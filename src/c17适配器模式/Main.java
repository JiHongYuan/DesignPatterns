package c17适配器模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/4/1917:46
 */
public class Main {

    /**
     *  适配器模式：将一个类的接口转换成客户希望的另外一个接口。
     *  使原本由于接口不兼容而不能一起工作的类可以一起工作。
     *
     *
     */
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
