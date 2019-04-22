package c2策略模式;

/**
 * @author jiHongYuan
 * @Title: Context
 * @ProjectName 大话设计模式
 * @date 2019/3/716:17
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void ContextInterface(){
        strategy.f();
    }
}
