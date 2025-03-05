package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.Utils.assertFailuresAreAssertionErrors;

import com.epam.rd.autotasks.paramcareless.tworootsonly.ParamCarelessTwoRootsOnlyQuadraticEquationNoRootsCasesTesting;
import com.epam.rd.autotasks.paramcareless.tworootsonly.ParamCarelessTwoRootsOnlyQuadraticEquationSingleRootCasesTesting;
import com.epam.rd.autotasks.paramcareless.tworootsonly.ParamCarelessTwoRootsOnlyQuadraticEquationTwoRootsCasesTesting;
import com.epam.rd.autotasks.paramcareless.tworootsonly.ParamCarelessTwoRootsOnlyQuadraticEquationZeroACasesTesting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

class ParamCarelessTwoRootsOnlyQuadraticEquationTestingTest extends QuadraticEquation {

    @Test
    void testParamCarelessTwoRootsOnlyQuadraticEquationNoRootsCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarelessTwoRootsOnlyQuadraticEquationNoRootsCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarelessTwoRootsOnlyQuadraticEquationNoRootsCasesTesting");
        Assertions.assertEquals(0, summary.getTestsSucceededCount(),
                "All tests must fail for this implementation");

        assertFailuresAreAssertionErrors(summary);
    }

    @Test
    void testParamCarelessTwoRootsOnlyQuadraticEquationSingleRootCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarelessTwoRootsOnlyQuadraticEquationSingleRootCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement at least four test methods in ParamCarelessTwoRootsOnlyQuadraticEquationSingleRootCasesTesting");
        Assertions.assertEquals(0, summary.getTestsSucceededCount(),
                "All tests must fail for this implementation");

        assertFailuresAreAssertionErrors(summary);
    }

    @Test
    void testParamCarelessTwoRootsOnlyQuadraticEquationTwoRootsCasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarelessTwoRootsOnlyQuadraticEquationTwoRootsCasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement four given test methods in ParamCarefulIncapableQuadraticEquationTwoRootsCasesTesting");
        Assertions.assertEquals(0, summary.getTestsFailedCount(),
                "All tests must pass for this implementation");
    }

    @Test
    void testParamCarelessTwoRootsOnlyQuadraticEquationZeroACasesTesting() {
        TestExecutionSummary summary =
                Utils.runTesting(ParamCarelessTwoRootsOnlyQuadraticEquationZeroACasesTesting.class);

        Assertions.assertTrue(4 <= summary.getTestsStartedCount(),
                "You must implement four given test methods in ParamCarefulIncapableQuadraticEquationTwoRootsCasesTesting");
        Assertions.assertEquals(0, summary.getTestsSucceededCount(),
                "All the cases must fail for this implementation");

        assertFailuresAreAssertionErrors(summary);
    }
}
