package head_first.decorator;

public class SteamMilk extends CondimentDecorator {
    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage beverage;

    public String getDescription() {
        return beverage.getDescription() + ", ������ũ";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
