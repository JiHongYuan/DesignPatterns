package c13建造者模式;

/**
 * @author jiHongYuan
 * @Title: People1Builder
 * @ProjectName 大话设计模式
 * @date 2019/3/922:54
 */
public class People1Builder extends Builder {
    private People people = new People();

    @Override
    public void setAge() {
        people.age = "10";
    }

    @Override
    public void setName(String name) {
        people.name = name;
    }

    public People getPeople() {
        return people;
    }
}
