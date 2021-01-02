package Decorator;

public class Milk extends AbstractAdding {

    public Milk(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        // TODO Auto-generated method stub
        return super.getTotalPrice() + 50;
    }
    
}