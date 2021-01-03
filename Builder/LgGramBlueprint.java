package Builder;

public class LgGramBlueprint extends BluePrint {
    private static final String DEFAULT = "default";

    public LgGramBlueprint() {
        computer = new Computer(DEFAULT, DEFAULT, DEFAULT);
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("8G");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256 ssd");
    }
}
