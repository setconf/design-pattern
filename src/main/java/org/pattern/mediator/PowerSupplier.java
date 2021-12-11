package org.pattern.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PowerSupplier {

    public void turnOn() {
        log.info("Power is turned On!");
    }

    public void turnOff() {
        log.info("Power is turned Off!");
    }
}
