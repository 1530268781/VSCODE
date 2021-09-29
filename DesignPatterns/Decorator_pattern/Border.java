package DesignPatterns.Decorator_pattern;

public abstract class Border extends Display {
    protected Display display;  //被修饰物
    protected Border(Display display) {
        this.display = display;
    }
}
