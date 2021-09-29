package DesignPatterns.Visitor_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    public ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        this.size = size;
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }

    public Entry add(Entry entry) {     //重新add()方法
        directory.add(entry);
        return this;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);        
    }
    
}
