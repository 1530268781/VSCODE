package DesignPatterns.Iterator_Pattern;

public class NBookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    private int step;

    public NBookShelfIterator(BookShelf bookShelf, int step) {
        this.bookShelf = bookShelf;
        this.index = 0;
        this.step = step;
    }

    @Override
    public boolean hasNext() {
        if ((index + step) <= bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index += step;
        return book;
    }

}
