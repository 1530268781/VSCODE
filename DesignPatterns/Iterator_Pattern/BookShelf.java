package DesignPatterns.Iterator_Pattern;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int maxSize;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
        this.maxSize = maxSize;
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        if(last < maxSize){
            books[last] = book;
            last++;
        }else{
            try {
                throw new Exception("The BookShelf is full and can't append any book!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public Iterator r_Iterator() {
        return new RBookShelfIterator(this);
    }

    @Override
    public Iterator n_Iterator(int step) {
        return new NBookShelfIterator(this, step);
    }
}
