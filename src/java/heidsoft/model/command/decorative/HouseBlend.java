package heidsoft.model.command.decorative;


/**
 * 这是另一种饮料，作为和Espresso一样
 * HouseBlend 类型饮料
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        description ="HouseBlend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
