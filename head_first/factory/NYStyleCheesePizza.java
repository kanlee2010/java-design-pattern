package head_first.factory;

public class NYStyleCheesePizza implements Pizza {
    String type;

    public NYStyleCheesePizza() {
        type = "NYStyleCheesePizza";
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
