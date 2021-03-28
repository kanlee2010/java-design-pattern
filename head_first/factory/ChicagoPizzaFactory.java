package head_first.factory;

public class ChicagoPizzaFactory implements SimplePizzaFactory {

    @Override
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
