package org.pattern.interpreter.evaluator;

import java.util.Deque;

import org.pattern.interpreter.expression.Expression;
import org.pattern.interpreter.expression.Minus;
import org.pattern.interpreter.expression.Number;

public class MinusEvaluator extends TokenEvaluator {

    public static MinusEvaluator create() {
        return new MinusEvaluator();
    }

    @Override
    public boolean isValidToken(String token) {
        return token.equals("-");
    }

    @Override
    public void evaluateToken(Deque<Expression> stack, String token) {
        double result = new Minus(stack.pop(), stack.pop()).interpret();
        stack.push(new Number(result));
    }
}
