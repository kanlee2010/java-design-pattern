package AbstractFactory2.linux;

import AbstractFactory2.frwk.Button;

public class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("리눅스 클릭");
    }
    
}
