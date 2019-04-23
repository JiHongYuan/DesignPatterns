package c24职责链模式;

/**
 * @author jiHongYuan
 * @Title: Handler
 * @ProjectName DesignPatterns
 * @date 2019/4/2321:24
 */
public abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handlerRequest(int request);
}

class ConcreteHandler1 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass().getName() + "处理请求" + request);
        } else if (handler != null) {
            handler.handlerRequest(request);
        }
    }
}

class ConcreteHandler2 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass().getName() + "处理请求" + request);
        } else if (handler != null) {
            handler.handlerRequest(request);
        }
    }
}

class ConcreteHandler3 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println(this.getClass().getName() + "处理请求" + request);
        } else if (handler != null) {
            handler.handlerRequest(request);
        }
    }
}