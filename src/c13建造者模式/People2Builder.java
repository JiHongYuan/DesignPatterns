package c13建造者模式;

/**
 * @author jiHongYuan
 * @Title: People2Builder
 * @ProjectName 大话设计模式
 * @date 2019/3/922:58
 */
public class People2Builder extends Builder {
    private People people = new People();

    @Override
    public void setAge() {
        people.age = "11";
    }

    @Override
    public void setName(String name) {
        people.name = name;
    }

    public People getPeople() {
        return people;
    }
}
