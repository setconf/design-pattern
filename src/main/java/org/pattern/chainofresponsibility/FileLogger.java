package org.pattern.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileLogger extends AbstractLogger {

    public FileLogger(LogLevel level) {
        super(level);
    }

    @Override
    public void write(String message) {
        log.info("File::Logger: " + message);
    }
}
