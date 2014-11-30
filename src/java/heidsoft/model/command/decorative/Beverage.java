/*****************************************************
 * 装饰模式
 * 1、继承Beverage抽象类，是为了有正确的类型，而不是继承它的行为。
 *      行为来自装饰者和基础组件，或与其他装饰者之间的组合关系。
 *
 *
 *
 *
 *
 *
 *
 *
 *****************************************************/

package heidsoft.model.command.decorative;

/**
 * 饮料抽象类
 */
public abstract class Beverage {
    String description ="Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
