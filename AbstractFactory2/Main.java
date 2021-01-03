package AbstractFactory2;

import AbstractFactory2.frwk.*;

public class Main {
    public static void main(String[] args) {
        GuiFactory guiFactory = Factory.getGuiFactory();
        Button button = guiFactory.createButton();
        TextArea textArea = guiFactory.createTextArea();

        button.click();
        System.out.println(textArea.getText());
    }
}
