package DesignPatterns.AbstractFactory_pattern.tablefactory;

import java.util.Iterator;

import DesignPatterns.AbstractFactory_pattern.factory.Item;
import DesignPatterns.AbstractFactory_pattern.factory.Tray;

public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>\n");
        buffer.append("<table width=\"100%\" border=\"1\">\n");

        buffer.append("<tr>\n");
        buffer.append(
                "<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + itemList.size() + "\">" + caption + "</td>");
        buffer.append("</tr>\n");

        buffer.append("<tr>");
        Iterator<Item> it = itemList.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</tr>\n");

        buffer.append("</table>");
        buffer.append("</td>\n");
        return buffer.toString();
    }

}
