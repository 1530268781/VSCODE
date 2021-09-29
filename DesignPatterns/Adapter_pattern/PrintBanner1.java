package DesignPatterns.Adapter_pattern;

public class PrintBanner1 extends Print1 {
    private Banner banner;

    public PrintBanner1(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWidthParen();
    }

    @Override
    public void printStrong() {
        banner.showWidthAster();
    }
}