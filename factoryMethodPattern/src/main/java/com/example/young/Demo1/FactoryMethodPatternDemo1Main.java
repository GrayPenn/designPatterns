package com.example.young.Demo1;

/**
 * @author pgy
 * @date 2021/3/1 3:02 下午
 **/
public class FactoryMethodPatternDemo1Main {


//    public static void main(String[] args) {
//        LoggerFactory factory;
//        Logger logger;
//        factory = new FileLoggerFactory(); //可引入配置文件实现
//        logger = factory.createLogger();
//        logger.writeLog();
//    }


//    public static void main(String[] args) {
//        LoggerFactory factory;
//        Logger logger;
//        factory = (LoggerFactory)XMLUtil.getBean(); //getBean()的返回类型为Object，需要进行强制类型转换
//        logger = factory.createLogger();
//        logger.writeLog();
//    }


    public static void main(String args[]) {
        LoggerFactory factory;
        factory = (LoggerFactory)XMLUtil.getBean();
        factory.writeLog(); //直接使用工厂对象来调用产品对象的业务方法
    }
}
