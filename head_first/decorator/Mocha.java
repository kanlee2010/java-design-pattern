package head_first.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage beverage;

    public String getDescription() {
        return beverage.getDescription() + ", ¸ğÄ«";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
