package com.example.young;

/**
 * 迭代器（Iterator）
 * hasNext 判断是否存在下一个元素
 * next 用于获取该元素
 *
 * @author pgy
 * @date 2021/12/30 3:49 下午
 **/
public interface Iterator {

    /**
     * 确认接下来是否可以调用 next 方法
     *
     * @return
     */
    public abstract boolean hasNext();

    /**
     * 返回当前的元素，并指向下一个元素
     *
     * @return
     */
    public abstract Object next();


    /**
     * previous 向前遍历 =====
     */

}
