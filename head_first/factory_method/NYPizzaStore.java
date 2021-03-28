package head_first.factory_method;

import head_first.factory_method.PizzaStore;

public class NYPizzaStore extends PizzaStore {
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
