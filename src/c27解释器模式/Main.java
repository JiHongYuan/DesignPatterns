package c27解释器模式;

import c20迭代器.ConcreteAggregate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiHongYuan
 * @Title: Main
 * @ProjectName DesignPatterns
 * @date 2019/4/2411:31
 */
public class Main {

    /**
     * 解释器模式：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
     */
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression exp : list) {
            exp.interpret(context);
        }
    }
}
