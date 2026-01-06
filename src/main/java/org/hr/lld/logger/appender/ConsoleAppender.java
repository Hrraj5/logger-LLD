package org.hr.lld.logger.appender;

import lombok.RequiredArgsConstructor;
import org.hr.lld.logger.formatter.LogFormatter;
import org.hr.lld.logger.models.LogMessage;

@RequiredArgsConstructor
public class ConsoleAppender implements LogAppender{
    private final LogFormatter logFormatter;
    @Override
    public void append(LogMessage logMessage) {
        System.out.println(logFormatter.format(logMessage));
    }
}
