package TemplateMethod;

public abstract class GameConnectHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    public String requestConnection(String encodedInfo) {
        String decodedInfo = doSecurity(encodedInfo);
        String id = "aaa";
        String password = "1234";
        if(!authentication(id, password)) {
            throw new Error("���̵� ��ȣ ����ġ");
        }
        authorization(id);
        return connection(decodedInfo);
    }
}
