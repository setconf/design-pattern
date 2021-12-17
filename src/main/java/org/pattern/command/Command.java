package org.pattern.command;

/*
 * Command pattern is a behavioral design pattern which is useful to abstract business logic into discrete actions
 * which we call commands. This command object helps in loose coupling between two classes where one class (invoker)
 * shall call a method on other class (receiver) to perform a business operation.
 *
 * @see <a href="https://howtodoinjava.com/design-patterns/behavioral/command-pattern/">Command pattern</a>
 * */
public interface Command {
    void execute();
}
