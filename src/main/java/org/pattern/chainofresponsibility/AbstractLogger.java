package org.pattern.chainofresponsibility;

import lombok.Data;

import java.util.Objects;

@Data
public abstract class AbstractLogger {
    private LogLevel level;
    private AbstractLogger nextLogger;

    protected AbstractLogger(LogLevel level) {
        this.level = level;
    }

    public void logMessage(LogLevel level, String message) {
        if (this.level.ordinal() <= level.ordinal()) write(message);
        if (Objects.nonNull(nextLogger)) nextLogger.logMessage(level, message);
    }

    public abstract void write(String message);
}
