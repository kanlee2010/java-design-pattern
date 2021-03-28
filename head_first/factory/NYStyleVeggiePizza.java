package head_first.factory;

public class NYStyleVeggiePizza implements Pizza {
    String type;

    public NYStyleVeggiePizza() {
        type = "NYStyleVeggiePizza";
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
