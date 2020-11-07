package FactoryMethod.concrete;

import java.util.Date;

import FactoryMethod.framework.Item;
import FactoryMethod.framework.ItemCreator;

public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터베이스에서 회복 물약 정보");
    }

    @Override
    protected void createItemLog() {
        System.out.println("회복 물약을 새로 생성" + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}