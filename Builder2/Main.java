package Builder2;

public class Main {
    public static void main(String[] args) {
        Computer computer = ComputerBuilder.getInstance().setCpu("i7").setRam("16G")
                .setStorage("512 ssd").build();

        System.out.println(computer.toString());
    }
}
