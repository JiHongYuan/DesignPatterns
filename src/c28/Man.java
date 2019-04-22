package c28;

/**
 * @author jiHongYuan
 * @Title: Man
 * @ProjectName 大话设计模式
 * @date 2019/4/1722:21
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
