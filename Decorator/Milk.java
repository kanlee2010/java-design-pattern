package Decorator;

public class Milk extends AbstractAddingDecorator {

    public Milk(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 50;
    }

}
