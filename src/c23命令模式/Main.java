package c23命令模式;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName DesignPatterns
 * @date 2019/4/2310:16
 */
public class Main {
    /**
     *  命令模式：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，
     *  以及支持可撤销的操作。
     * */
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();
        i.setCommand(c);
        i.executeCommand();
    }
}
