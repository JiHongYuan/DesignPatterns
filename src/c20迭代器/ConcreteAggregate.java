package c20迭代器;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiHongYuan
 * @Title: ConcreteAggregate
 * @ProjectName 大话设计模式
 * @date 2019/4/2217:28
 */
public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }

    public Object getItem(int count){
        return items.get(count);
    }

    public void insert(int index,Object value){
        items.add(index,value);
    }
}
