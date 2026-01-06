package org.hr.lld.logger.handler;

import lombok.Setter;
import org.hr.lld.logger.appender.LogAppender;
import org.hr.lld.logger.models.LogMessage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class LogHandler {

    @Setter
    private  LogHandler handler;

    private List<LogAppender> appenderList =  new CopyOnWriteArrayList<>();

    public void subscribe(LogAppender logAppender){
        appenderList.add(logAppender);
    }

    private void notifySubscriber(LogMessage logMessage){
        for(LogAppender logAppender : appenderList){
            logAppender.append(logMessage);
        }
    }

    public void handle(LogMessage logMessage){
        if(canHandle(logMessage)){
            notifySubscriber(logMessage);
        }else{
            handler.handle(logMessage);
        }
    }

    public abstract boolean canHandle(LogMessage logMessage);

}
