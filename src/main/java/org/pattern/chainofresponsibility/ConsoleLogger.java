package org.pattern.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(LogLevel level) {
        super(level);
    }

    @Override
    public void write(String message) {
        log.info("Standard Console::Logger: " + message);
    }
}
