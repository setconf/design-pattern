package org.pattern.interpreter.expression;

public class Plus implements Expression {

    Expression left;
    Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double interpret() {
        return left.interpret() + right.interpret();
    }
}
