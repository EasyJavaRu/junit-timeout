package ru.easyjava.junit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class SolverTest {
    @Test
    public void testSolve() throws Exception {
        Solver testedObject = new Solver();
        assertThat(testedObject.solve(1, 2, 0.01), closeTo(1.65, 0.01));
    }

    @Test(timeout = 1)
    public void testSolveSlow() throws Exception {
        Solver testedObject = new Solver();
        assertThat(testedObject.solve(1, 2, 0.0000001), closeTo(1.65, 0.01));
    }
}
