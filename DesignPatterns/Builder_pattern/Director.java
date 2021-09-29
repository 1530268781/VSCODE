package DesignPatterns.Builder_pattern;

public class Director {
    private Builder builder;
    public String title;
    public String str;
    public String[] items;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle(title);
        builder.makeString(str);
        builder.makeItem(items);
        builder.close();
    }
}
