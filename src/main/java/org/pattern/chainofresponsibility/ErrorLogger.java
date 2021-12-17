package org.pattern.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(LogLevel level) {
        super(level);
    }

    @Override
    public void write(String message) {
        log.info("Error Console::Logger: " + message);
    }
}
