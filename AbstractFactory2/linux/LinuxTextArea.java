package AbstractFactory2.linux;

import AbstractFactory2.frwk.TextArea;

public class LinuxTextArea implements TextArea {

    @Override
    public String getText() {
        return "리눅스 텍스트";
    }
    
}
