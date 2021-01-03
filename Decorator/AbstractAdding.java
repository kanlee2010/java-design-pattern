package Decorator;

public class AbstractAdding implements IBeverage {
    private IBeverage base;

    public AbstractAdding(IBeverage base) {
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