package org.pattern.interpreter;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

import org.pattern.interpreter.evaluator.TokenEvaluator;
import org.pattern.interpreter.expression.Expression;

public class ReversePolishNotationEvaluator implements Evaluator {

    private final TokenEvaluator chain;

    public ReversePolishNotationEvaluator(TokenEvaluator chain) {
        this.chain = chain;
    }

    @Override
    public double evaluate(String expression) {
        Deque<Expression> stack = new LinkedList<>();
        for (String token : expression.split(" ")) {
            chain.evaluate(stack, token);
        }
        return stack.pop().interpret();
    }

    public static class ReversePolishNotationEvaluatorBuilder {
        private TokenEvaluator evaluatorChain;

        public static ReversePolishNotationEvaluatorBuilder create() {
            return new ReversePolishNotationEvaluatorBuilder();
        }

        /*
        * Compose evaluators chain.
        * */
        public ReversePolishNotationEvaluatorBuilder with(TokenEvaluator evaluator) {
            if (Objects.nonNull(this.evaluatorChain)) evaluator.setNextEvaluator(evaluatorChain);
            evaluatorChain = evaluator;
            return this;
        }

        public ReversePolishNotationEvaluator build() {
            return new ReversePolishNotationEvaluator(this.evaluatorChain);
        }
    }
}
