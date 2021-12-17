package org.pattern.command;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@AllArgsConstructor
@Slf4j
public class StartFanCommand implements Command {
    private Fan fan;

    public void execute() {
        log.info("Starting Fan...");
        fan.start();
    }
}
