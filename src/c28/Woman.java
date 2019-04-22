package c28;

/**
 * @author jiHongYuan
 * @Title: Woman
 * @ProjectName 大话设计模式
 * @date 2019/4/1722:22
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWoManConclusion(this);
    }
}
