package head_first.factory_method;

public class ChicagoStyleVeggiePizza implements Pizza {
    String type;

    public ChicagoStyleVeggiePizza() {
        type = "ChicagoStyleVeggiePizza";
    }

    public String getName() {
        return type;
    }

    public void prepare() {
        System.out.println(type + "prepare");
    }

    public void bake() {
        System.out.println(type + "bake");
    }

    public void cut() {
        System.out.println(type + "cut");
    }

    public void box() {
        System.out.println(type + "box");
    }

}
