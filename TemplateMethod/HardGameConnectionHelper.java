package TemplateMethod;

public class HardGameConnectionHelper extends GameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("��ȭ�� ���ڵ�");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("���ϵ� ���̵�/��ȣ Ȯ�� ����");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("��ȭ�� ���� Ȯ��");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("��ȭ�� ����");
        return info;
    }
}
