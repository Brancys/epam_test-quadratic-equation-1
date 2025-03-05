package com.epam.rd.autotasks;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class QuadraticEquationZeroACasesTesting {

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(0, 5, -30),
            Arguments.of(0, -3, 10),
            Arguments.of(0, -38, 1560),
            Arguments.of(0, 34, 1046.5)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void testZeroACase(double a, double b, double c) {
        assertThrows(IllegalArgumentException.class, () -> {
            quadraticEquation.solve(a, b, c);
        });
    }
}