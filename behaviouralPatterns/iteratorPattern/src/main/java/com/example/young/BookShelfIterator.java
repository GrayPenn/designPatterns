package com.example.young;

/**
 * 具体的迭代器 （Concretelterator）
 * Concrete adj. 实在的，具体的；
 * <p>
 * 该角色负责实现 Iterator 角色所定义的接口
 * 该角色中包含了遍历集合所必须的信息。
 * BookShelf实例保存在bookShelf中
 * 被指向的书的下标保存再 index 字段中
 *
 * @author pgy
 * @date 2021/12/30 3:49 下午
 **/
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
