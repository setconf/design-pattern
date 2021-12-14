package org.pattern.strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrategyTest {

    private static Context context;

    @BeforeAll
    public static void init() {
        context = new Context();
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new AddOperationStrategy(), 10, 5, 15),
                Arguments.of(new SubstractOperationStrategy(), 10, 5, 5),
                Arguments.of(new MultiplyOperationStrategy(), 10, 5, 50)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void strategyPatternTest(Strategy strategy, Integer num1, Integer num2, Integer expected) {
        context.setStrategy(strategy);
        assertEquals(expected, context.executeStrategy(num1, num2));
    }
}
