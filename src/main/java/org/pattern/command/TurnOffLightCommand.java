package org.pattern.command;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@AllArgsConstructor
@Slf4j
public class TurnOffLightCommand implements Command {
    private Light light;

    public void execute() {
        log.info("Turning off light...");
        light.turnOff();
    }
}
