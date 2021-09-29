package DesignPatterns.Prototype_pattern;

import DesignPatterns.Prototype_pattern.framework.*;

public class Main {
    public static void main(String[] args) {
        //准备模板
        Manager manager =new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        //注册
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        //生成
        Prototype p1 = manager.create("strong message");
        Prototype p2 = manager.create("warning box");
        Prototype p3 = manager.create("slash box");
        p1.use("Hello world!");
        p2.use("Hello world!");
        p3.use("Hello world!");

    };
}

