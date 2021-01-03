package Builder;

public abstract class BluePrint {

    protected Computer computer;

    public abstract void setCpu();

    public abstract void setRam();

    public abstract void setStorage();

    public Computer getComputer() {
        return computer;
    }
}
