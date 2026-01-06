package org.hr.lld.logger;

import org.hr.lld.logger.appender.LogAppender;
import org.hr.lld.logger.handler.*;
import org.hr.lld.logger.models.LogLevel;

public class LogConfiguration {

    private static DebugHandler debugHandler = new DebugHandler();
    private static InfoHandler infoHandler = new InfoHandler();
    private static WarnHandler warnHandler = new WarnHandler();
    private static ErrorHandler errorHandler = new ErrorHandler();


    public static LogHandler build(){
        debugHandler.setHandler(warnHandler);
        warnHandler.setHandler(infoHandler);
        infoHandler.setHandler(errorHandler);
        return debugHandler;
    }

    public static void setLogAppender(LogAppender logAppender,LogLevel logLevel){
        switch(logLevel){
            case DEBUG -> debugHandler.subscribe(logAppender);
            case INFO -> infoHandler.subscribe(logAppender);
            case WARN -> warnHandler.subscribe(logAppender);
            case ERROR -> errorHandler.subscribe(logAppender);
        }
    }
}
