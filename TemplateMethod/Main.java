package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        GameConnectHelper helper = new DefaultGameConnectionHelper();
        helper.requestConnection("아이디 암호 접속 정보");

        GameConnectHelper hardhelper = new HardGameConnectionHelper();
        hardhelper.requestConnection("아이디 암호 접속 정보");
    }
}
