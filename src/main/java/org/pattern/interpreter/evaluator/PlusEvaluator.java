package org.pattern.interpreter.evaluator;

import java.util.Deque;

import org.pattern.interpreter.expression.Expression;
import org.pattern.interpreter.expression.Number;
import org.pattern.interpreter.expression.Plus;

public class PlusEvaluator extends TokenEvaluator {

    public static PlusEvaluator create() {
        return new PlusEvaluator();
    }
    @Override
    public boolean isValidToken(String token) {
        return token.equals("+");
    }

    @Override
    public void evaluateToken(Deque<Expression> stack, String token) {
        double result = new Plus(stack.pop(), stack.pop()).interpret();
        stack.push(new Number(result));
    }
}
