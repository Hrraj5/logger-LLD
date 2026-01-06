package org.hr.lld.logger;

import org.hr.lld.logger.appender.ConsoleAppender;
import org.hr.lld.logger.formatter.TextFormatter;
import org.hr.lld.logger.models.LogLevel;

public class LogApp {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        LogConfiguration.setLogAppender(new ConsoleAppender(new TextFormatter()), LogLevel.DEBUG);
        LogConfiguration.setLogAppender(new ConsoleAppender(new TextFormatter()), LogLevel.INFO);
        LogConfiguration.setLogAppender(new ConsoleAppender(new TextFormatter()), LogLevel.ERROR);
//        LogConfiguration.addLogAppender(new FileAppender(new PlainTextFormatter(), "log_file.txt"), LogLevel.INFO);
//        LogConfiguration.addLogAppender(new FileAppender(new PlainTextFormatter(), "log_file.txt"), LogLevel.ERROR);

        logger.debug("Hello How are you");
        logger.info("Hello I m fine");
        logger.error("404 Error");
    }
}
