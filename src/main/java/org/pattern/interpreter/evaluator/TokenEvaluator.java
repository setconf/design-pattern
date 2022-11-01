package org.pattern.interpreter.evaluator;

import java.util.Deque;
import java.util.Objects;

import org.pattern.interpreter.expression.Expression;

public abstract class TokenEvaluator {

    private TokenEvaluator nextEvaluator;

    public final void evaluate(Deque<Expression> stack, String token) {
        if (isValidToken(token)) {
            evaluateToken(stack, token);
            return;
        }
        if (Objects.nonNull(nextEvaluator)) {
            nextEvaluator.evaluate(stack, token);
        }
    }

    public void setNextEvaluator(TokenEvaluator evaluator) {
        this.nextEvaluator = evaluator;
    }

    public abstract boolean isValidToken(String token);

    public abstract void evaluateToken(Deque<Expression> stack, String token);
}
