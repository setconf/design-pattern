package org.pattern.mediator;

import lombok.Data;

/*
 * Mediator pattern is used to reduce communication complexity between multiple objects or classes.
 * This pattern provides a mediator class which normally handles all the communications between different classes
 * and supports easy maintenance of the code by loose coupling. Mediator pattern falls under behavioral pattern category.
 *
 * @see <a href="https://howtodoinjava.com/design-patterns/behavioral/mediator-pattern/">Mediator pattern</a>
 * */
@Data
public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}