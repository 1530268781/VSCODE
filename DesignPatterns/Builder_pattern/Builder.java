package DesignPatterns.Builder_pattern;

public interface  Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItem(String[] items);

    public abstract void close();
}
