package org.pattern.interpreter.expression;

public class Minus implements Expression {

    Expression left;
    Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double interpret() {
        return right.interpret() - left.interpret();
    }
}