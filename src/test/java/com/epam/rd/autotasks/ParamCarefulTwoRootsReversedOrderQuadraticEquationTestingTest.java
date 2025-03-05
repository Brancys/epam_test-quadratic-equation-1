package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.Utils.assertFailuresAreAssertionErrors;

import com.epam.rd.autotasks.paramcareful.tworootsreversed.ParamCarefulTwoRootsReversedOrderQuadraticEquationNoRootsCasesTesting;
import com.epam.rd.autotasks.paramcareful.tworootsreversed.ParamCarefulTwoRootsReversedOrderQuadraticEquationSingleRootCasesTesting;
import com.epam.rd.autotasks.paramcareful.tworootsreversed.ParamCarefulTwoRootsReversedOrderQuadraticEquationTwoRootsCasesTesting;
import com.epam.rd.autotasks.paramcareful.tworootsreversed.ParamCarefulTwoRootsReversedOrderQuadraticEquationZeroACasesTesting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

class ParamCarefulTwoRootsReversedOrderQuadraticEquationTestingTest {

    @Test
    void testParamCarefulTwoRootsReversedOrderQuadraticEquationNoRootsCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarefulTwoRootsReversedOrderQuadraticEquationNoRootsCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarefulTwoRootsReversedOrderQuadraticEquationNoRootsCasesTesting");
        Assertions.assertEquals(0, summary.getTestsSucceededCount(),
                "All tests must fail for this implementation");

        assertFailuresAreAssertionErrors(summary);
    }

    @Test
    void testParamCarefulTwoRootsReversedOrderQuadraticEquationSingleRootCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarefulTwoRootsReversedOrderQuadraticEquationSingleRootCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarefulTwoRootsReversedOrderQuadraticEquationSingleRootCasesTesting");
        Assertions.assertEquals(0, summary.getTestsSucceededCount(),
                "All tests must fail for this implementation");

        assertFailuresAreAssertionErrors(summary);
    }

    @Test
    void testParamCarefulTwoRootsReversedOrderQuadraticEquationTwoRootsCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarefulTwoRootsReversedOrderQuadraticEquationTwoRootsCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarefulTwoRootsReversedOrderQuadraticEquationTwoRootsCasesTesting");
        Assertions.assertEquals(0, summary.getTestsFailedCount(),
                "All tests must pass for this implementation");
    }

    @Test
    void testParamCarefulTwoRootsReversedOrderQuadraticEquationZeroACasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarefulTwoRootsReversedOrderQuadraticEquationZeroACasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarefulTwoRootsReversedOrderQuadraticEquationZeroACasesTesting");
        Assertions.assertEquals(0, summary.getTestsFailedCount(),
                "All tests must pass for this implementation");
    }
}
