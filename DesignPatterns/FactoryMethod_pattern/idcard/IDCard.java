package DesignPatterns.FactoryMethod_pattern.idcard;

import DesignPatterns.FactoryMethod_pattern.framework.*;

public class IDCard extends Product {
    private String owner;

    // 不写public是让包外的内不能直接new IDCard,而必须借助和IDCard同包的IDCardFactory
    IDCard(String owner) {
        System.out.println("制作" + owner + "的IDCard");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的IDCard");
    }

    public String getOwner() {
        return owner;
    }
}
