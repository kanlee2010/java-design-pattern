package AbstractFactory2.win;

import AbstractFactory2.frwk.Button;
import AbstractFactory2.frwk.GuiFactory;
import AbstractFactory2.frwk.TextArea;

public class WinGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
    
}
