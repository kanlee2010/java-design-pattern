package FactoryMethod.concrete;

import FactoryMethod.framework.Item;

public class MpPotion implements Item {
    @Override
    public void use() {
        System.out.println("���� ȸ��");
    }
}
