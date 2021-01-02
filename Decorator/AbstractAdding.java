package Decorator;

public class AbstractAdding implements IBeverage {
    private IBeverage base;

    public AbstractAdding(IBeverage base) {
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        // TODO Auto-generated method stub
        return base.getTotalPrice();
    }

    public IBeverage getBase() {
        return base;
    }

    public void setBase(IBeverage base) {
        this.base = base;
    }

}