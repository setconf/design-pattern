package org.pattern.observer;

/*
 * According to GoF definition, observer pattern defines a one-to-many dependency between objects so that when one
 * object changes state, all its dependents are notified and updated automatically.
 * It is also referred to as the publish-subscribe pattern. Observer pattern falls under behavioral pattern category.
 *
 * @see <a href="https://howtodoinjava.com/design-patterns/behavioral/observer-design-pattern/">Observer pattern</a>
 * */
public interface Observer {
    void update(Message m);
}
