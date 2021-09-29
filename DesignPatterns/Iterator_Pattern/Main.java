package DesignPatterns.Iterator_Pattern;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("World"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator it = bookShelf.iterator();
        Iterator rIt = bookShelf.r_Iterator();
        Iterator nIt = bookShelf.n_Iterator(2);

        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
        while (rIt.hasNext()) {
            Book book = (Book)rIt.next();
            System.out.println(book.getName());
        }
        while (nIt.hasNext()) {
            Book book = (Book)nIt.next();
            System.out.println(book.getName());
        }
    }
}
