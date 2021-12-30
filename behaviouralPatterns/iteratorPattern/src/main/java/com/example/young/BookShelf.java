package com.example.young;

/**
 * 书架 （ConcreteAggregate）
 * Concrete adj. 实在的，具体的；
 *
 * @author pgy
 * @date 2021/12/30 3:49 下午
 **/
public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
