package c9原型模式;

/**
 * @author jiHongYuan
 * @Title: Mian
 * @ProjectName 大话设计模式
 * @date 2019/3/721:42
 */
public class Main implements Cloneable{
    /**
     * 原型模式 说白了就是clone
     * 要注意一下 浅拷贝和深拷贝（特别是深拷贝 ）
     *  浅拷贝引用直接复制
     * */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
