package c27解释器模式;

import c22桥接模式.Abstraction;

/**
 * @author jiHongYuan
 * @Title: AbstractExpression
 * @ProjectName DesignPatterns
 * @date 2019/4/2411:34
 */
public abstract class AbstractExpression {
    public abstract void interpret(Context context);
}


class TerminalExpression extends AbstractExpression{

    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}

class NonterminalExpression extends AbstractExpression{

    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}