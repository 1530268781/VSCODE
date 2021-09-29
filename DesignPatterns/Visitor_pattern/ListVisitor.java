package DesignPatterns.Visitor_pattern;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file.getName());
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory.getName());
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator<Entry> it = directory.directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
    
}
