package TemplateMethod;

public class DefaultGameConnectionHelper extends GameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("���ڵ�");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("���̵�/��ȣ Ȯ�� ����");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("���� Ȯ��");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("����");
        return info;
    }
}
