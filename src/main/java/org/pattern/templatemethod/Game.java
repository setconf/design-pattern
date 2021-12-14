package org.pattern.templatemethod;

public interface Game {
    void initializePlay();

    void startPlay();

    void endPlay();

    /*
     * Template method design pattern is widely accepted behavioral design pattern to enforce some sort of algorithm
     * (fixed set of steps) in the context of programming.
     *
     * It defines the sequential steps to execute a multi-step algorithm and optionally can provide a default
     * implementation as well (based on requirements).
     *
     * @see <a href="https://howtodoinjava.com/design-patterns/behavioral/template-method-pattern/">Template Method pattern</a>
     * */
    default void play() {
        initializePlay();
        startPlay();
        endPlay();
    }
}
