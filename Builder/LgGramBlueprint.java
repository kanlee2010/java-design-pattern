package Builder;

public class LgGramBlueprint extends BluePrint {
    
    public LgGramBlueprint() {
        computer = new Computer("default", "default", "default");
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