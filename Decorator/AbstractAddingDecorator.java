package Decorator;

public class AbstractAddingDecorator implements IBeverage {
    private IBeverage base;

    public AbstractAddingDecorator(IBeverage base) {
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }

    public IBeverage getBase() {
        return base;
    }

    public void setBase(IBeverage base) {
        this.base = base;
    }

}
