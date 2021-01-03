package Builder2;

public class ComputerBuilder {
    private static final String DEFAULT = "default";

    private Computer computer;

    public ComputerBuilder() {
        computer = new Computer(DEFAULT, DEFAULT, DEFAULT);
    }

    public Computer build() {
        return this.computer;
    }

    public static ComputerBuilder getInstance() {
        return new ComputerBuilder();
    }

    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }
}
