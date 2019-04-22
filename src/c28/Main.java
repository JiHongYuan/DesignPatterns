package c28;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/4/1722:27
 */
public class Main {
    // 访问者模式
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success v1 = new Success();
        objectStructure.display(v1);
    }
}
