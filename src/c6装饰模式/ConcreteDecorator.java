package c6装饰模式;

/**
 * @author jiHongYuan
 * @Title: ConcreteDecorator
 * @ProjectName 大话设计模式
 * @date 2019/3/717:02
 */
public class ConcreteDecorator extends Component {
    @Override
    public void Operation() {
        System.out.println("ConcreteDecorator.Operation()");
    }
}
