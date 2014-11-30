package heidsoft.model.command.decorative;

/**
 * 浓缩咖啡类
 * 1、首先Espresso扩展自Beverage类，因为Espresso是一种饮料
 */
public class Espresso extends Beverage {

    //为了要设置饮料的描述，我们写了一个构造器，这里的description实力变量继承自Beverage
    public Espresso(){
        description ="Espresso";//这是浓咖啡
    }

    //最后需要计算Espresso的价钱，现在不需要调料的价钱，直接把Espresso的价钱1.99返回即可
    @Override
    public double cost() {
        return 1.99;
    }
}
