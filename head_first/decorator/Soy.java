package head_first.decorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage beverage;

    public String getDescription() {
        return beverage.getDescription() + ", µÎÀ¯";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
