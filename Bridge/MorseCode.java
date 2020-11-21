package Bridge;

public class MorseCode {
    
    private MorseCodeFunction func;

    public void dot() {
        func.dot();
    }

    public void dash() {
        func.dash();
    }

    public void space() {
        func.space();
    }

    /**
     * @return MorseCodeFunction return the func
     */
    public MorseCodeFunction getFunc() {
        return func;
    }

    /**
     * @param func the func to set
     */
    public void setFunc(MorseCodeFunction func) {
        this.func = func;
    }

    public MorseCode(MorseCodeFunction func) {
        this.func = func;
    }

}