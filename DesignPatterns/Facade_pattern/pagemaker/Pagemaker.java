package DesignPatterns.Facade_pattern.pagemaker;

import java.io.FileWriter;
import java.util.Properties;

public class Pagemaker {
    private Pagemaker() {

    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);

            HtmlWriter writer = new HtmlWriter(new FileWriter("filename"));
            writer.title("Welcome to " + username + " 's page!");
            writer.paragraph(username + " 欢迎来到 " + username + " 的主页。");
            writer.paragraph("等着你的邮件哦");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " +  mailaddr + " (" + username + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
