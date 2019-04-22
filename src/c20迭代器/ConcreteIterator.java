package c20迭代器;

/**
 * @author jiHongYuan
 * @Title: ConcreteIterator
 * @ProjectName 大话设计模式
 * @date 2019/4/2217:25
 */
public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItem(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < aggregate.count()) {
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current  >= aggregate.count();
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }
}
