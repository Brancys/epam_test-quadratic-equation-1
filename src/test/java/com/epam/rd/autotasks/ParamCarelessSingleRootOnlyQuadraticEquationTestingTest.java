package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.Utils.assertFailuresAreAssertionErrors;

import com.epam.rd.autotasks.paramcareless.singlerootonly.ParamCarelessSingleRootOnlyQuadraticEquationNoRootsCasesTesting;
import com.epam.rd.autotasks.paramcareless.singlerootonly.ParamCarelessSingleRootOnlyQuadraticEquationSingleRootCasesTesting;
import com.epam.rd.autotasks.paramcareless.singlerootonly.ParamCarelessSingleRootOnlyQuadraticEquationTwoRootsCasesTesting;
import com.epam.rd.autotasks.paramcareless.singlerootonly.ParamCarelessSingleRootOnlyQuadraticEquationZeroACasesTesting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

class ParamCarelessSingleRootOnlyQuadraticEquationTestingTest extends QuadraticEquation {

    @Test
    void testParamCarelessSingleRootOnlyQuadraticEquationNoRootsCasesTesting() {
        TestExecutionSummary
                summary = Utils.runTesting(ParamCarelessSingleRootOnlyQuadraticEquationNoRootsCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarelessSingleRootOnlyQuadraticEquationNoRootsCasesTesting");
        Assertions.assertEquals(0, summary.getTestsSucceededCount(),
                "All tests must fail for this implementation");

        assertFailuresAreAssertionErrors(summary);
    }

    @Test
    void testParamCarelessSingleRootOnlyQuadraticEquationSingleRootCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarelessSingleRootOnlyQuadraticEquationSingleRootCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test test methods in ParamCarelessSingleRootOnlyQuadraticEquationSingleRootCasesTesting");
        Assertions.assertEquals(0, summary.getTestsFailedCount(),
                "All tests must pass for this implementation");
    }

    @Test
    void testParamCarelessSingleRootOnlyQuadraticEquationTwoRootsCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarelessSingleRootOnlyQuadraticEquationTwoRootsCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarelessSingleRootOnlyQuadraticEquationTwoRootsCasesTesting");
        Assertions.assertEquals(0, summary.getTestsSucceededCount(),
                "All tests must fail for this implementation");

        assertFailuresAreAssertionErrors(summary);
    }

    @Test
    void testParamCarelessSingleRootOnlyQuadraticEquationZeroACasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarelessSingleRootOnlyQuadraticEquationZeroACasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarefulTwoRootsReversedOrderQuadraticEquationNoRootsCasesTesting");
        Assertions.assertEquals(0, summary.getTestsSucceededCount(),
                "All tests must fail for this implementation");

        assertFailuresAreAssertionErrors(summary);
    }
}
