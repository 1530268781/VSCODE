package DesignPatterns.Facade_pattern;

import DesignPatterns.Facade_pattern.pagemaker.Pagemaker;

public class Main {
    public static void main(String[] args) {
        Pagemaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
