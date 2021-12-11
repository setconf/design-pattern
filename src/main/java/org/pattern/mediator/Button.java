package org.pattern.mediator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Button {
    private Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
        mediator.setButton(this);
    }

    public void press() {
        log.info("Button is pressed!");
        mediator.press();
    }
}
