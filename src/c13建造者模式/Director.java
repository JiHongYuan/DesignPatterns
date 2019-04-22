package c13建造者模式;

/**
 * @author jiHongYuan
 * @Title: Director
 * @ProjectName 大话设计模式
 * @date 2019/3/923:01
 */
public class Director {
    public void construct(Builder builder, String name) {
        builder.setAge();
        builder.setName(name);
    }
}
