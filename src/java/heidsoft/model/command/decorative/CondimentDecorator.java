package heidsoft.model.command.decorative;

/**
 * 调料类
 * 1、首先，必须让CondimentDecorator(调料装饰者)取代Beverage（饮料），所以讲CondimentDecorator扩展自Beverage类
 * 2、所有的调料装饰者都必须重新实现getDescription()方法
 */
public  abstract class CondimentDecorator extends Beverage{

    public abstract String getDescription();
}
