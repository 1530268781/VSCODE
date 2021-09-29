package DesignPatterns.Adapter_pattern;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWidthParen() {
        System.out.println("(" + string + ")");
    }

    public void showWidthAster() {
        System.out.println("*" + string + "*");
    }
}
