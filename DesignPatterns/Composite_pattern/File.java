package DesignPatterns.Composite_pattern;

public class File extends Entry {

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        // System.out.println(prefix + "/" + this.toString);
        // System.out.println(prefix + "/" + toString);
    }
    
}
