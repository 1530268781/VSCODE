package DesignPatterns.Visitor_pattern;

public abstract class Entry implements Element {
    protected String name;
    protected int size;

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {   
        throw new FileTreatmentException(this.getName() + " is a file and can't add anything!");
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix); // 函数重载

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

}
