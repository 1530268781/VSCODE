package DesignPatterns.Prototype_pattern.framework;

import java.util.HashMap;

public class Manager {
    HashMap<String,Prototype> showcase = new HashMap<>();

    public void register(String name, Prototype prototype) {
        showcase.put(name, prototype);
    }

    public Prototype create(String protoname) {
        Prototype p = (Prototype) showcase.get(protoname);
        return p.createClone();
    }
}
