package Builder;

public class Computer {

    @Override
    public String toString() {
        return "{" +
            " cpu='" + getCpu() + "'" +
            ", ram='" + getRam() + "'" +
            ", storage='" + getStorage() + "'" +
            "}";
    }

    public Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }
    private String cpu;
    private String ram;
    private String storage;

    /**
     * @return String return the cpu
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * @param cpu the cpu to set
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * @return String return the ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * @return String return the storage
     */
    public String getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(String storage) {
        this.storage = storage;
    }

}
