package c22桥接模式;

/**
 * @author jiHongYuan
 * @Title: Abstraction
 * @ProjectName DesignPatterns
 * @date 2019/4/239:52
 */
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public  void operation(){
        implementor.operation();
    }
}

class RefinedAbstraction extends Abstraction{
    @Override
    public void operation() {
        implementor.operation();
    }
}