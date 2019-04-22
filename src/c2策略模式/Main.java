package c2策略模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/3/716:13
 */
public class Main {
    /**
     * 策略模式 定义了算法家族。分别封装起来，让他们之间可以互相替换。
     * 此模式让算法的变化，不会影响到使用算法的客户。
     *
     * 策略模式和简单工厂的不同
     *  简单工厂 主要担当创建对象
     *  策略模式 选择不同的策略 完成不同的逻辑
     * */
    public static void main(String[] args) {

        new Context(new StrategyA()).ContextInterface();
        new Context(new StrategyB()).ContextInterface();
        new Context(new StrategyC()).ContextInterface();
    }

}
