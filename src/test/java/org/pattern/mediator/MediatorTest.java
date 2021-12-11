package org.pattern.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MediatorTest {

    @Test
    void givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        Mediator mediator = new Mediator();
        Fan fan = new Fan(mediator);
        Button button = new Button(mediator);
        PowerSupplier powerSupplier = new PowerSupplier();
        mediator.setPowerSupplier(powerSupplier);

        assertFalse(fan.isOn());

        button.press();
        assertTrue(fan.isOn());

        button.press();
        assertFalse(fan.isOn());
    }
}
