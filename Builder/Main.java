package Builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.setBlueprint(new LgGramBlueprint());
        Computer computer = builder.build();

        System.out.println(computer.toString());
    }
}
