package com.example.young;

/**
 * 迭代器模式
 *
 * @author pgy
 * @date 2021/12/30 4:00 下午
 **/
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Arount the world in 80 days"));
        bookShelf.appendBook(new Book("uncle Chang"));
        bookShelf.appendBook(new Book("Java Base"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }


    }
}
