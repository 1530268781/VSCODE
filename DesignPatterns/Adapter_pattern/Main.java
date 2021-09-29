package DesignPatterns.Adapter_pattern;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("类适配器模式");
        p.printWeak();
        p.printStrong();

        Print1 p1 = new PrintBanner1("对象适配器模式");
        p1.printWeak();
        p1.printStrong();
    }
}
