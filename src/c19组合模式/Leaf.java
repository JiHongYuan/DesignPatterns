package c19组合模式;

import java.util.Collections;

/**
 * @author jiHongYuan
 * @Title: Leaf
 * @ProjectName 大话设计模式
 * @date 2019/4/2216:35
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        String s = String.join("", Collections.nCopies(depth,"-"));
        System.out.println(s + name);
    }
}
