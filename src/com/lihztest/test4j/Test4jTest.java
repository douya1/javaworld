package com.lihztest.test4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test4jTest {

    static Logger logger = Logger.getLogger(Test4jTest.class);

    public static void main(String[] args) throws InterruptedException {

        //BasicConfigurator.configure();
        PropertyConfigurator.configure("D:\\javaSet\\javaworld\\src\\log4j.properties");
        //logger.setLevel(Level.DEBUG);
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");

        Thread.sleep(1000);
        logger.error("错误信息");
        logger.warn("警告信息");
        logger.fatal("致命信息");
    }
}
