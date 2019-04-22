package c16状态模式;

/**
 * @author jiHongYuan
 * @Title: State
 * @ProjectName 大话设计模式
 * @date 2019/4/1917:30
 */
public abstract class State {
    public abstract void handle(Context context);

}

class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        context.state = new ConcreteStateB();
        System.out.println("这里是分支A");
    }
}

class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        context.state = new ConcreteStateC();
        System.out.println("这里是分支B");
    }
}

class ConcreteStateC extends State {

    @Override
    public void handle(Context context) {
        context.state = new ConcreteStateA();
        System.out.println("这里是分支C");
    }
}