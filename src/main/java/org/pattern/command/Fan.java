package org.pattern.command;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Fan {
    private boolean isStarted;

    void start() {
        log.info("Fan Started...");
        isStarted = true;
    }

    void stop() {
        log.info("Fan stopped...");
        isStarted = false;
    }
}
