package org.hr.lld.logger;

import org.hr.lld.logger.handler.LogHandler;
import org.hr.lld.logger.models.LogLevel;
import org.hr.lld.logger.models.LogMessage;

public class Logger {

    private static final Logger INSTANCE = new Logger();
    private final LogHandler logHandler;

    private Logger(){
        logHandler = LogConfiguration.build();
    }

    public static Logger getInstance(){ return INSTANCE;}

    private void log(LogLevel logLevel, String message){
        LogMessage logMessage = new LogMessage(message,System.currentTimeMillis(),logLevel);
        logHandler.handle(logMessage);
    }

    public void debug(String message){
        log(LogLevel.DEBUG,message);
    }
    public void warn(String message){
        log(LogLevel.WARN,message);
    }
    public void info(String message){
        log(LogLevel.INFO,message);
    }
    public void error(String message){
        log(LogLevel.ERROR,message);
    }
}
