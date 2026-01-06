package org.hr.lld.logger.formatter;

import org.hr.lld.logger.models.LogMessage;

public interface LogFormatter {
    String format(LogMessage logMessage);
}
