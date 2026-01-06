package org.hr.lld.logger.handler;

import org.hr.lld.logger.models.LogLevel;
import org.hr.lld.logger.models.LogMessage;

public class InfoHandler extends LogHandler{
    @Override
    public boolean canHandle(LogMessage logMessage) {
        return LogLevel.INFO == logMessage.getLogLevel();
    }
}
