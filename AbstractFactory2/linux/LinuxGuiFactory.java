package AbstractFactory2.linux;

import AbstractFactory2.frwk.Button;
import AbstractFactory2.frwk.GuiFactory;
import AbstractFactory2.frwk.TextArea;

public class LinuxGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
    
}
