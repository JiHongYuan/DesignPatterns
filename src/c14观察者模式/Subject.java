package c14观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiHongYuan
 * @Title: Subject
 * @ProjectName 大话设计模式
 * @date 2019/4/1821:39
 */
public class Subject {
    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void mNotify() {
        for (Observer o : list) {
            o.update();
        }
    }
}

class ConcreteSubject extends Subject{
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
