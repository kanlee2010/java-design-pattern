package head_first.factory;

public class Main {
    public static void main(String[] args) {
        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        nyStore.orderPizza("veggie");

        ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
        chicagoStore.orderPizza("cheese");
    }
}
