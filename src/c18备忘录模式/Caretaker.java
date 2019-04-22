package c18备忘录模式;

/**
 * @author jiHongYuan
 * @Title: Caretaker
 * @ProjectName 大话设计模式
 * @date 2019/4/2216:10
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
