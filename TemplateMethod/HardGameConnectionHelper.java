package TemplateMethod;

public class HardGameConnectionHelper extends GameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("강화된 디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("강하된 아이디/암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("강화된 권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("강화된 연결");
        return info;
    }
}
