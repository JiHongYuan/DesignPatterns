package c2策略模式;

/**
 * @author jiHongYuan
 * @Title: Strategy
 * @ProjectName 大话设计模式
 * @date 2019/3/716:14
 */
public abstract class Strategy {
    public abstract void f();
}

class StrategyA extends Strategy {
    @Override
    public void f() {
        System.out.println("StrategyA.f()");
    }
}


class StrategyB extends Strategy {
    @Override
    public void f() {
        System.out.println("StrategyB.f()");
    }
}

class StrategyC extends Strategy {
    @Override
    public void f() {
        System.out.println("StrategyC.f()");
    }
}