package Builder;

abstract public class BluePrint {

    protected Computer computer;

    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();
    public Computer getComputer() {
        return computer;
    }
}