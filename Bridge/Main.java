package Bridge;

public class Main {
    public static void main(String[] args) {
        PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunc());
        code.g().a();

        PrintMorseCode flashcode = new PrintMorseCode(new FlashMorseCodeFunc());
        flashcode.g().a();
    }
}