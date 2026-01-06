package org.hr.lld.logger.appender;

import org.hr.lld.logger.models.LogMessage;

public interface LogAppender {

    void append(LogMessage logMessage);
}
