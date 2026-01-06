package org.hr.lld.logger.handler;

import org.hr.lld.logger.models.LogLevel;
import org.hr.lld.logger.models.LogMessage;

public class ErrorHandler extends LogHandler{
    @Override
    public boolean canHandle(LogMessage logMessage) {
        return LogLevel.ERROR == logMessage.getLogLevel();
    }
}
