package org.pattern.mediator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Fan {
    private Mediator mediator;
    private boolean isOn;

    public Fan(Mediator mediator) {
        this.mediator = mediator;
        mediator.setFan(this);
    }

    public void turnOn() {
        log.info("Fan is turned On!");
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        log.info("Fan is turned Off!");
        isOn = false;
        mediator.stop();
    }
}
