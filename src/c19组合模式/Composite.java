package c19组合模式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jiHongYuan
 * @Title: Composite
 * @ProjectName 大话设计模式
 * @date 2019/4/2216:37
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        String s = String.join("", Collections.nCopies(depth,"-"));
        System.out.println(s + name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
