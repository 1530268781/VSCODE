package DesignPatterns.Adapter_pattern;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWidthParen();
    }

    @Override
    public void printStrong() {
        showWidthAster();
    }
}
