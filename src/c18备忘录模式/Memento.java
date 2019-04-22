package c18备忘录模式;

/**
 * @author jiHongYuan
 * @Title: Memento
 * @ProjectName 大话设计模式
 * @date 2019/4/2216:08
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }


    public String getState() {
        return state;
    }
}
