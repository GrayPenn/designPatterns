package com.example.young.Demo1;

/**
 * @author pgy
 * @date 2021/3/1 3:00 下午
 **/
public class FileLoggerFactory  extends LoggerFactory {

    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}