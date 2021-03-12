package com.example.young.Demo1;

/**
 * @author pgy
 * @date 2021/3/1 3:00 下午
 **/
public class DatabaseLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}