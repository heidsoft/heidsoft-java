package heidsoft.model.command.decorative;

/**
 *
 */
public class DarkRoast extends CondimentDecorator{

    Beverage beverage;

    public DarkRoast(){description="DarkRoast";}

    public DarkRoast(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return 0.22;
    }


    @Override
    public String getDescription() {
        return description;
    }
}
