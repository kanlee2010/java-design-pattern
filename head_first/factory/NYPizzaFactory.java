package head_first.factory;

public class NYPizzaFactory implements SimplePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else
            return null;
        return pizza;
    }

}
