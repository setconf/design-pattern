package org.pattern.interpreter.evaluator;

import java.util.Deque;

import org.pattern.interpreter.expression.Expression;
import org.pattern.interpreter.expression.Number;

public class NumberEvaluator extends TokenEvaluator {

    public static NumberEvaluator create() {
        return new NumberEvaluator();
    }

    @Override
    public boolean isValidToken(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException nan) {
            return false;
        }
    }

    @Override
    public void evaluateToken(Deque<Expression> stack, String token) {
        stack.push(new Number(Double.parseDouble(token)));
    }
}
