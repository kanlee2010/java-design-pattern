package Bridge;

public class PrintMorseCode extends MorseCode {

    public PrintMorseCode(MorseCodeFunction func) {
        super(func);
    }

    public PrintMorseCode g() {
        dash();dash();dot();space();
        return this;
    }

    public PrintMorseCode a() {
        dot();dash();dot();space();
        return this;
    }
    
}