package org.pattern.command;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@AllArgsConstructor
@Slf4j
public class StopFanCommand implements Command {
    private Fan fan;

    public void execute() {
        log.info("Stopping Fan...");
        fan.stop();
    }
}
