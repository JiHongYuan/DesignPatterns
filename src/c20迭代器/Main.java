package c20迭代器;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/4/2217:38
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.insert(0,"1");
        a.insert(1,"2");
        a.insert(2,"3");

        Iterator i = new ConcreteIterator(a);
        Object item = i.first();
        while(!i.isDone()){
            System.out.println(i.currentItem());
            i.next();
        }
    }
}
