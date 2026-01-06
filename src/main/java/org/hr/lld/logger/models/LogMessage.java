package org.hr.lld.logger.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogMessage {
    private String message;
    private long timeStamp;
    private LogLevel logLevel;
}
