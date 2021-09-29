package DesignPatterns.Iterator_Pattern;

public interface Aggregate {
    public abstract Iterator iterator();
    public abstract Iterator r_Iterator();
    public abstract Iterator n_Iterator(int step);
}
