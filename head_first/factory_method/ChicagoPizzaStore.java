package head_first.factory_method;

import head_first.factory_method.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else
            return null;
        return pizza;
    }

}
