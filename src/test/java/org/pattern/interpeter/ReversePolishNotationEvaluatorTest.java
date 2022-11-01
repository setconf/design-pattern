package org.pattern.interpeter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.pattern.interpreter.Evaluator;
import org.pattern.interpreter.ReversePolishNotationEvaluator.ReversePolishNotationEvaluatorBuilder;
import org.pattern.interpreter.evaluator.MinusEvaluator;
import org.pattern.interpreter.evaluator.NumberEvaluator;
import org.pattern.interpreter.evaluator.PlusEvaluator;

class ReversePolishNotationEvaluatorTest {

    static Evaluator evaluator;

    @BeforeAll
    static void init() {
        evaluator = ReversePolishNotationEvaluatorBuilder
                .create()
                .with(NumberEvaluator.create())
                .with(PlusEvaluator.create())
                .with(MinusEvaluator.create())
                .build();
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("2 3 +", 5.0),
                Arguments.of("4 3 -", 1.0),
                Arguments.of("4 3 - 2 +", 3.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")


    void reversePolishNotationEvaluatorTest(String expression, double result) {
        assertEquals(evaluator.evaluate(expression), result);
    }
}
