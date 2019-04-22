package c18备忘录模式;

/**
 * @author jiHongYuan
 * @Title: Originator
 * @ProjectName 大话设计模式
 * @date 2019/4/2216:07
 */
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show() {
        System.out.println("Statue=" + state);
    }
}
