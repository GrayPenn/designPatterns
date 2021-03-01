package com.example.young.Demo1;

/**
 * @author pgy
 * @date 2021/3/1 2:58 下午
 **/
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }

}
