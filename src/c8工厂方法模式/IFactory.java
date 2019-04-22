package c8工厂方法模式;

/**
 * @author jiHongYuan
 * @Title: OperationFactory
 * @ProjectName 大话设计模式
 * @date 2019/3/715:33
 */

public interface IFactory {
    Operation createOperation();
}

class OperationAddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}

class OperationSubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}

class OperationMulFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}

class OperationDivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}