package DesignPatterns.Iterator_Pattern;

public class RBookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public RBookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index--;
        return book;
    }
}
