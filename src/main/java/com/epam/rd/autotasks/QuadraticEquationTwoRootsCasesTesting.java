package com.epam.rd.autotasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;
import java.util.Arrays;

public class QuadraticEquationTwoRootsCasesTesting {

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(2, 5, -3, "-3.0 0.5"),
            Arguments.of(1, -3, 1, "0.3819660112501051 2.618033988749895"),
            Arguments.of(2, -38, 156, "6.0 13.0"),
            Arguments.of(-0.5, 34, 1046.5, "-23.0 91.0")
        );
    }

    @ParameterizedTest
@MethodSource("testCases")
public void testTwoRootsCase(double a, double b, double c, String expected) {
    String result = quadraticEquation.solve(a, b, c);

    // Verificar si el resultado es "no roots" cuando se esperaban dos raíces
    if (result.equals("no roots")) {
        throw new AssertionError("Expected two roots, but got 'no roots' for coefficients: a=" + a + ", b=" + b + ", c=" + c);
    }

    // Convertir los resultados en arrays de double
    double[] expectedRoots = Arrays.stream(expected.split(" "))
                                   .mapToDouble(Double::parseDouble)
                                   .sorted()
                                   .toArray();

    double[] resultRoots = Arrays.stream(result.split(" "))
                                 .mapToDouble(Double::parseDouble)
                                 .sorted()
                                 .toArray();

    // Verificar que ambos arrays tengan la misma longitud
    assertEquals(expectedRoots.length, resultRoots.length, "Número incorrecto de raíces.");

    // Comparar cada raíz permitiendo una pequeña tolerancia
    for (int i = 0; i < expectedRoots.length; i++) {
        assertEquals(expectedRoots[i], resultRoots[i], 1e-6, 
            "Raíz incorrecta para la ecuación con coeficientes: a=" + a + ", b=" + b + ", c=" + c);
    }
}

}