package head_first.factory_method;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("My Pizze = " + pizza.getName());

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("My Pizze = " + pizza.getName());
    }
}
