package DesignPatterns.Prototype_pattern.framework;

public interface Prototype extends Cloneable {
    public abstract void use(String s);
    public abstract Prototype createClone();
}
