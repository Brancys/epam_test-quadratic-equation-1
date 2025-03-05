package com.epam.rd.autotasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class QuadraticEquationNoRootsCasesTesting {

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(-563, 0, -5),
            Arguments.of(2, 10, 30),
            Arguments.of(-0.5, 1, -50),
            Arguments.of(1, 11, 111),
            Arguments.of(2, 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void testNoRootsCase(double a, double b, double c) {
        assertEquals("no roots", quadraticEquation.solve(a, b, c));
    }
}