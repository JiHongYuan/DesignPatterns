package c6装饰模式;

/**
 * @author jiHongYuan
 * @Title: Decorator
 * @ProjectName 大话设计模式
 * @date 2019/3/716:59
 */
public class Decorator extends Component {
    protected Component component;

    @Override
    public void Operation() {
        if (component != null){
            component.Operation();
        }
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
