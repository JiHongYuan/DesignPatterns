package c26享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiHongYuan
 * @Title: FlyweightFactory
 * @ProjectName DesignPatterns
 * @date 2019/4/2411:21
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public FlyweightFactory() {
        flyweightMap.put("X", new ConcreteFlyweight());
        flyweightMap.put("Y", new ConcreteFlyweight());
        flyweightMap.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweightMap.get(key);
    }
}
