package c10模板方法模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/3/913:23
 */
public class Main {
    /**
     *  居然 我写那个导出表格的东西 居然用了这种设计模式
     *  说白了就是继承抽象类 重写方法
     *  这种我觉得用处还是蛮大的 也蛮简单的
     *  但是维护起来好像有点麻烦 后期如果加了什么代码 可能我水平问题吧。。。。
     *
     *  模板方法模式：定义一共操作中的算法骨架，而将一些步骤延迟到子类中。
     *  模板方法使得子类不改变一个算法的结构既可重定义该算法的某些特定步骤。
     * */
    public static void main(String[] args) {
        AbstractClass abstractClass1 = new class1();
        AbstractClass abstractClass2 = new class2();
        abstractClass1.init();
        abstractClass2.init();
    }
}
