package c24职责链模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName DesignPatterns
 * @date 2019/4/2321:32
 */
public class Main {
    /**
     *  职责链模式：使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。
     *  将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它位置。
     *
     *  我觉得有点像装饰模式。
     *  通过set组合起来 像链表一样串起来
     *  但是我觉得装饰模式是通过一串 完成某一件事情。
     *  责任链模式像是switch一样
     * */
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setHandler(h2);
        h2.setHandler(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int request : requests) {
            h1.handlerRequest(request);
        }

    }
}
