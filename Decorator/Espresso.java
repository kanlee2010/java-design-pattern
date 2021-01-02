package Decorator;

public class Espresso extends AbstractAdding {

    static protected int espressoCount = 0;

    public Espresso(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        // TODO Auto-generated method stub
        return super.getTotalPrice() + getAddPrice();
    }
    
    private static int getAddPrice() {
        espressoCount += 1;
        int addPrice = 100;

        if(espressoCount > 1) {
            addPrice = 70;
        }
        return addPrice;
    }
}