package com.example.young.Demo1;


/**
 * @author pgy
 * @date 2021/3/1 2:53 下午
 */
//日志记录器工厂接口：抽象工厂
//public interface LoggerFactory {
//
//    Logger createLogger();
//}


//改为抽象类
abstract class LoggerFactory {
    //在工厂类中直接调用日志记录器类的业务方法writeLog()
    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    public abstract Logger createLogger();
}