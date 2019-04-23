package c25中介者模式;

/**
 * @author jiHongYuan
 * @Title: Mediator
 * @ProjectName DesignPatterns
 * @date 2019/4/2321:52
 */
public abstract class Mediator {
    public abstract void send(String message,Colleague colleague);
}

class ConcreteMediator extends Mediator{
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == colleague1){
            colleague2.mNotify(message);
        }else{
            colleague1.mNotify(message);
        }
    }

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }
}