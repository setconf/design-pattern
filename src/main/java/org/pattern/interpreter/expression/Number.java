package org.pattern.interpreter.expression;

public class Number implements Expression {

    private final double value;

    public Number(double number) {
        this.value = number;
    }

    public double interpret() {
        return this.value;
    }
}
