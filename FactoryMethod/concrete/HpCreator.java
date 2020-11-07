package FactoryMethod.concrete;

import java.util.Date;

import FactoryMethod.framework.Item;
import FactoryMethod.framework.ItemCreator;

public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("�����ͺ��̽����� ȸ�� ���� ����");
    }

    @Override
    protected void createItemLog() {
        System.out.println("ȸ�� ������ ���� ����" + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}