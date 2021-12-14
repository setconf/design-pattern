package org.pattern.strategy;

import lombok.Setter;

@Setter
public class Context {
    private Strategy strategy;

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
