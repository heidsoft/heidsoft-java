package heidsoft.model.command.decorative;

/**
 * 具体实现一个装饰者，先从摩卡下手
 *
 * 1、摩卡是一个装饰者，所以让它扩展自CondimentDecorator，同时CondimentDecorator扩展自Beverage
 *
 * 为了让摩卡能够引用一个Beverage,做法如下
 * a、用一个实例变量记录饮料，也就是被装饰者
 * b、想要让被装饰者（饮料）被记录到实例变量中。这里的做法是，把饮料当作构造器的参数，再由构造器将此饮料记录在实例变量中。
 *
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ". Mocka";
    }

    //要计算带Mocka饮料的价钱，首先把调用 委托给被装饰对象，以计算价钱。然后在加上Mocka的价钱。得到最后结果
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
