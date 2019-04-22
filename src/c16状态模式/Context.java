package c16状态模式;

/**
 * @author jiHongYuan
 * @Title: Context
 * @ProjectName 大话设计模式
 * @date 2019/4/1917:31
 */
public class Context {
    public State state;

    public Context(State state) {
        this.state = state;
    }

    public void request(){
        state.handle(this);
    }
}
