package c25中介者模式;

/**
 * @author jiHongYuan
 * @Title: Collegue
 * @ProjectName DesignPatterns
 * @date 2019/4/2321:52
 */
public class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}


class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void mNotify(String message){
        System.out.println("同事1得到信息：" + message);
    }
}

class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void mNotify(String message){
        System.out.println("同事2得到信息：" + message);
    }
}