package c28访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiHongYuan
 * @Title: ObjectStructure
 * @ProjectName 大话设计模式
 * @date 2019/4/1722:24
 */
public class ObjectStructure {
    private List<Person> personList = new ArrayList<>();

    public void attach(Person e) {
        personList.add(e);
    }

    public void display(Action action){
        for (Person e:personList) {
            e.accept(action);
        }
    }
}
