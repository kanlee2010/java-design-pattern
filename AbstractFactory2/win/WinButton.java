package AbstractFactory2.win;

import AbstractFactory2.frwk.Button;

public class WinButton implements Button {

    @Override
    public void click() {
        System.out.println("윈도우 클릭");
    }
    
}
