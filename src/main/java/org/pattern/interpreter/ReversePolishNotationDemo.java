package org.pattern.interpreter;

import java.util.List;

import org.javatuples.Pair;
import org.pattern.interpreter.ReversePolishNotationEvaluator.ReversePolishNotationEvaluatorBuilder;
import org.pattern.interpreter.evaluator.MinusEvaluator;
import org.pattern.interpreter.evaluator.NumberEvaluator;
import org.pattern.interpreter.evaluator.PlusEvaluator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReversePolishNotationDemo {

    /*
    * Reverse Polish notation.
    * This is a notation in which the operands are added at the end of the operators.
    * The 1 + 2 becomes 1 2 +; (1+2)*3 becomes 1 2 + 3 *.
    * The advantage is that we no longer need parentheses.
    *
    * The interpreter pattern is used in practice to interpret regular expressions.
    * It's a good exercise to implement the interpreter pattern for such a scenario;
    * however, we'll choose a simple grammar for our example.
    * We are going to apply it to parse a simple function with one variable: f(x).
    *
    * */
    public static void main(String[] args) {
        Evaluator evaluator = ReversePolishNotationEvaluatorBuilder
                .create()
                .with(NumberEvaluator.create())
                .with(PlusEvaluator.create())
                .with(MinusEvaluator.create())
                .build();
        List<String> expressions = List.of("2 3 +", "4 3 -", "4 3 - 2 +");
        expressions.stream()
                .map(e -> Pair.with(e, evaluator.evaluate(e)))
                .forEach(p -> log.info("{} interpreted to {}", p.getValue0(), p.getValue1()));
    }
}
