package Builder;

public class ComputerBuilder {
    private BluePrint bluePrint;

    public void setBlueprint(BluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }

    public Computer build() {
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();
        return bluePrint.getComputer();
    }
}