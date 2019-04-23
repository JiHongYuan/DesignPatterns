package c23命令模式;

/**
 * @author jiHongYuan
 * @Title: Invoker
 * @ProjectName DesignPatterns
 * @date 2019/4/2311:42
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
