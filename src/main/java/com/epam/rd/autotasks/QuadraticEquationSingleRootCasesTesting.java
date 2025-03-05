package com.epam.rd.autotasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class QuadraticEquationSingleRootCasesTesting {

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(1, -2, 1, "1.0"),
            Arguments.of(1, 0, 0, "-0.0"),
            Arguments.of(8, 0, 0, "-0.0"),
            Arguments.of(1, -6, 9, "3.0"),
            Arguments.of(1, 12, 36, "-6.0")
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void testSingleRootCase(double a, double b, double c, String expected) {
        String result = quadraticEquation.solve(a, b, c);

        // Verificar si el resultado incorrectamente devuelve "no roots"
        if (result.equals("no roots")) {
            fail("Expected a single root but got 'no roots' for coefficients: a=" + a + ", b=" + b + ", c=" + c);
        }

        // Verificar que el resultado sea el esperado
        assertEquals(expected, result, "Incorrect root for coefficients: a=" + a + ", b=" + b + ", c=" + c);
    }
}
