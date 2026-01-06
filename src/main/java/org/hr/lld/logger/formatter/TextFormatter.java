package org.hr.lld.logger.formatter;

import org.hr.lld.logger.models.LogMessage;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TextFormatter implements LogFormatter{

    private final DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    @Override
    public String format(LogMessage logMessage) {
        String formattedTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(logMessage.getTimeStamp()), ZoneId.systemDefault()).format(dateTimeFormatter);
        return String.format("%s [%s] - %s", formattedTime,logMessage.getLogLevel(),logMessage.getMessage());
    }
}
