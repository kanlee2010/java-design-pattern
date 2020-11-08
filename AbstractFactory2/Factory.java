package AbstractFactory2;

import AbstractFactory2.frwk.GuiFactory;
import AbstractFactory2.linux.LinuxGuiFactory;
import AbstractFactory2.win.WinGuiFactory;

public class Factory {
    private static String OS = System.getProperty("os.name").toLowerCase();

    public static GuiFactory getGuiFactory() {
        System.out.println("OS : " + OS);
        if(OS.indexOf("win") >= 0) {
            return new WinGuiFactory();
        } else if(OS.indexOf("linux") >= 0) {
            return new LinuxGuiFactory();
        }
        return new WinGuiFactory();
    }
}
