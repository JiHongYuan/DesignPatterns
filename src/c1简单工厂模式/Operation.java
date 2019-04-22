package c1简单工厂模式;

/**
 * @author jiHongYuan
 * @Title: Operation
 * @ProjectName 大话设计模式
 * @date 2019/3/715:33
 */
public abstract class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public abstract double getResult();

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}


class OperationAdd extends Operation{
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}

class OperationSub extends Operation{
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}

class OperationMul extends Operation{
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}

class OperationDiv extends Operation{
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}