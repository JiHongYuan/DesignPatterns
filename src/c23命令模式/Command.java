package c23命令模式;

import c19组合模式.Composite;

/**
 * @author jiHongYuan
 * @Title: z
 * @ProjectName DesignPatterns
 * @date 2019/4/2310:31
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}

class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }

}

