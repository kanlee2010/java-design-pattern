package AbstractFactory2.win;

import AbstractFactory2.frwk.TextArea;

public class WinTextArea implements TextArea {

    @Override
    public String getText() {
        return "윈도우 텍스트";
    }
    
}
