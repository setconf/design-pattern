package org.pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 * Memento pattern is used to restore state of an object to a previous state.
 * Memento pattern falls under behavioral pattern category.
 *
 * @see <a href="https://www.tutorialspoint.com/design_pattern/memento_pattern.htm">Mediator pattern</a>
 * */
@Getter
@AllArgsConstructor
public class Memento {
    private String state;
}
