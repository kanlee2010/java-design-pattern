package head_first.decorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage beverage;

    public String getDescription() {
        return beverage.getDescription() + ", ÈÖÇÎ";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
