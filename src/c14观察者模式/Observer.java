package c14观察者模式;

/**
 * @author jiHongYuan
 * @Title: Observer
 * @ProjectName 大话设计模式
 * @date 2019/4/1821:40
 */
public abstract class Observer {
    public abstract void update();
}

class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者" + name + "的新状态是" + observerState);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}