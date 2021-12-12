package org.pattern.state;

/*
 * The state pattern is a behavioral design pattern. According to GoF definition, a state allows an object
 * to alter its behavior when its internal state changes. The object will appear to change its class.
 *
 * It can be drawn from above definition that there shall be a separate concrete class per possible state of an object.
 * Each concrete state object will have logic to accept or reject a state transition request based on it’s present state
 * and context information passed to it as method arguments.
 *
 * @see <a href="https://howtodoinjava.com/design-patterns/behavioral/state-design-pattern/">State pattern</a>
 * */
public interface State {
    void updateState(Context ctx);
}
