package DesignPatterns.AbstractFactory_pattern.listfactory;

import DesignPatterns.AbstractFactory_pattern.factory.*;

public class ListFactory extends Factory {

    public ListFactory(){
        
    }
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
