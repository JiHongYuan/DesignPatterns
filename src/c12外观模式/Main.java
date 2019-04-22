package c12外观模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName 大话设计模式
 * @date 2019/3/922:13
 */
public class Main {
    /**
     *  有点像serviceImpl
     *  controller 调用service的接口 serviceImpl实现接口
     *  serviceImpl 方法往往将一些公用的东西 封装在里面 给不同的controller用
     *
     * */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.f();
        facade.k();
    }
}
