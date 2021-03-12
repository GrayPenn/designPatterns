package com.example.young.Demo1;

/**
 * @author pgy
 * @date 2021/3/1 2:59 下午
 **/

//文件日志记录器：具体产品
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
