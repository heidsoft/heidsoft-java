package heidsoft.model.command.decorative;

/**
 * 测试装饰模式的相关类
 */
public class StarbuzzCoffee{

    public static void main(String[] args){

        Beverage beverage = new Espresso();//订一杯Espresso，不需要调料，打印出它的描述与价钱
        System.out.println(beverage.getDescription() +"$"+beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() +"$"+beverage1.cost());
    }

}
