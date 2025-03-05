package com.epam.rd.autotasks;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

class DefaultQuadraticEquationTestingTest {

    @Test
    void testQuadraticEquationNoRootsCasesTesting() {
        final String testCases = QuadraticEquationNoRootsCasesTesting.testCases()
                .map(arg -> Arrays.stream(arg.get()).map(Object::toString).collect(joining(",")))
                .collect(joining(";"));
        assertEquals("-563,0,-5;2,10,30;-0.5,1,-50;1,11,111;2,2,2", testCases,
                "You must specify (-563,0,-5; 2,10,30; -0.5,1,-50; 1,11,111; 2,2,2) cases in QuadraticEquationNoRootsCasesTesting.testCases() method");

        TestExecutionSummary summary = Utils.runTesting(QuadraticEquationNoRootsCasesTesting.class);

        assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in QuadraticEquationNoRootsCasesTesting");
        assertEquals(0, summary.getTestsFailedCount(), "All tests must pass for this implementation");
    }

    @Test
    void testQuadraticEquationSingleRootCasesTesting() {
        final String testCases = QuadraticEquationSingleRootCasesTesting.testCases()
                .map(arg -> Arrays.stream(arg.get()).map(Object::toString).collect(joining(",")))
                .collect(joining(";"));
        assertEquals(
                "1,-2,1,1.0;1,0,0,-0.0;8,0,0,-0.0;1,-6,9,3.0;1,12,36,-6.0",
                testCases,
                "You must specify (1,-2,1,1.0; 1,0,0,0.0; 8,0,0,0.0; -6,9,3.0; 12,36,-6.0) cases in QuadraticEquationSingleRootCasesTesting.testCases() method");


        TestExecutionSummary summary = Utils.runTesting(QuadraticEquationSingleRootCasesTesting.class);

        assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in QuadraticEquationSingleRootCasesTesting");
        assertEquals(0, summary.getTestsFailedCount(), "All tests must pass for this implementation");
    }

    @Test
    void testQuadraticEquationTwoRootsCasesTesting() {
        final String testCases = QuadraticEquationTwoRootsCasesTesting.testCases()
                .map(arg -> Arrays.stream(arg.get()).map(Object::toString).collect(joining(",")))
                .collect(joining(";"));
        assertEquals(
                "2,5,-3,-3.0 0.5;1,-3,1,0.3819660112501051 2.618033988749895;2,-38,156,6.0 13.0;-0.5,34,1046.5,-23.0 91.0",
                testCases,
                "You must specify (2,5,-3,-3.0 0.5; 1,-3,1,0.3819660112501051 2.618033988749895; 2,-38,156,6.0 13.0; -0.5,34,1046.5,-23.0 91.0) cases in QuadraticEquationTwoRootsCasesTesting.testCases() method");

        TestExecutionSummary summary = Utils.runTesting(QuadraticEquationTwoRootsCasesTesting.class);

        assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement four given test methods in QuadraticEquationTwoRootsCasesTesting");
        assertEquals(0, summary.getTestsFailedCount(), "All tests must pass for this implementation");
    }

    @Test
    void testQuadraticEquationZeroACasesTesting() {
        final String testCases = QuadraticEquationZeroACasesTesting.testCases()
                .map(arg -> Arrays.stream(arg.get()).map(Object::toString).collect(joining(",")))
                .collect(joining(";"));
        assertEquals(
                "0,5,-30;0,-3,10;0,-38,1560;0,34,1046.5",
                testCases,
                "You must specify (0,5,-30; 0,-3,10; 0,-38,1560; 0,34,1046.50) cases in QuadraticEquationZeroACasesTesting.testCases() method");

        TestExecutionSummary summary = Utils.runTesting(QuadraticEquationZeroACasesTesting.class);

        assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement four given test methods in QuadraticEquationZeroACasesTesting");
        assertEquals(0, summary.getTestsFailedCount(), "All tests must pass for this implementation");
    }
}
