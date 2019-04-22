package c20迭代器;

/**
 * @author jiHongYuan
 * @Title: Iterator
 * @ProjectName 大话设计模式
 * @date 2019/4/2217:22
 */
public abstract class Iterator {
    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
