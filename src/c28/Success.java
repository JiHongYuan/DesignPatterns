package c28;

/**
 * @author jiHongYuan
 * @Title: Success
 * @ProjectName 大话设计模式
 * @date 2019/4/1722:23
 */
public class Success extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println("Success.getManConclusion()");
    }

    @Override
    public void getWoManConclusion(Woman woman) {
        System.out.println("Success.getWoManConclusion()");
    }
}
