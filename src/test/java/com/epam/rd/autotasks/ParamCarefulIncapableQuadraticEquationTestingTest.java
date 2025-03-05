package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.Utils.assertFailuresAreAssertionErrors;

import com.epam.rd.autotasks.paramcareful.incapable.ParamCarefulIncapableQuadraticEquationNoRootsCasesTesting;
import com.epam.rd.autotasks.paramcareful.incapable.ParamCarefulIncapableQuadraticEquationSingleRootCasesTesting;
import com.epam.rd.autotasks.paramcareful.incapable.ParamCarefulIncapableQuadraticEquationTwoRootsCasesTesting;
import com.epam.rd.autotasks.paramcareful.incapable.ParamCarefulIncapableQuadraticEquationZeroACasesTesting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

class ParamCarefulIncapableQuadraticEquationTestingTest {

    @Test
    void testParamCarefulIncapableQuadraticEquationNoRootsCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarefulIncapableQuadraticEquationNoRootsCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarefulIncapableQuadraticEquationNoRootsCasesTesting");
        Assertions.assertEquals(0, summary.getTestsFailedCount(), "All tests must pass for this implementation");
    }

    @Test
    void testParamCarefulIncapableQuadraticEquationSingleRootCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarefulIncapableQuadraticEquationSingleRootCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarefulIncapableQuadraticEquationSingleRootCasesTesting");
        Assertions.assertEquals(0, summary.getTestsSucceededCount(),
                "All tests must fail for this implementation");

        assertFailuresAreAssertionErrors(summary);
    }

    @Test
    void testParamCarefulIncapableQuadraticEquationTwoRootsCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarefulIncapableQuadraticEquationTwoRootsCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarefulIncapableQuadraticEquationTwoRootsCasesTesting");
        Assertions.assertEquals(0, summary.getTestsSucceededCount(),
                "All tests must pass for this implementation");

        assertFailuresAreAssertionErrors(summary);
    }

    @Test
    void testParamCarefulIncapableQuadraticEquationZeroACasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarefulIncapableQuadraticEquationZeroACasesTesting.class);

        Assertions.assertEquals(4, summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarefulIncapableQuadraticEquationZeroACasesTesting");
        Assertions.assertEquals(0, summary.getTestsFailedCount(),
                "All tests must pass for this implementation");
    }
}
