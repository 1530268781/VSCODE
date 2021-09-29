package DesignPatterns.Prototype_pattern;

import DesignPatterns.Prototype_pattern.framework.Prototype;

public class UnderlinePen implements Prototype {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Prototype createClone() {
        Prototype p = null;
        try {
            p = (Prototype)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
