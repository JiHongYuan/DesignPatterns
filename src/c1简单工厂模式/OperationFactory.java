package c1简单工厂模式;

/**
 * @author jiHongYuan
 * @Title: OperationFactory
 * @ProjectName 大话设计模式
 * @date 2019/3/715:33
 */
public class OperationFactory {
    public static Operation createOperation(String o) {
        Operation operation = null;
        switch (o) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
