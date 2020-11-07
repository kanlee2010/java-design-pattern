package FactoryMethod.concrete;

import java.util.Date;

import FactoryMethod.framework.Item;
import FactoryMethod.framework.ItemCreator;

public class MpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("�����ͺ��̽����� ���� ���� ����");
    }

    @Override
    protected void createItemLog() {
        System.out.println("���¹����� ���� ����" + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}