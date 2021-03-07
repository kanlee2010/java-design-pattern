package head_first.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블랜드";
    }

    public double cost() {
        return 0.89;
    }
}
