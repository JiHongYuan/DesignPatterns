package c13建造者模式;

/**
 * @author jiHongYuan
 * @Title: Builder
 * @ProjectName 大话设计模式
 * @date 2019/3/922:43
 */
public abstract class Builder {
    public abstract void setAge();
    public abstract void setName(String name);
    public abstract People getPeople();
}


