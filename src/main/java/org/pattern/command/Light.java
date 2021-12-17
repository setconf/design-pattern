package org.pattern.command;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Light {
    private boolean isTurnOn;

    public void turnOn() {
        log.info("Light is on");
        isTurnOn = true;
    }

    public void turnOff() {
        log.info("Light is off");
        isTurnOn = false;
    }
}
