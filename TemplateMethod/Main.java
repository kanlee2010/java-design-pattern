package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        GameConnectHelper helper = new DefaultGameConnectionHelper();
        helper.requestConnection("���̵� ��ȣ ���� ����");

        GameConnectHelper hardhelper = new HardGameConnectionHelper();
        hardhelper.requestConnection("���̵� ��ȣ ���� ����");
    }
}
