package ru.easyjava.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class SolverRuleTest {
    @Rule
    public Timeout timeout = new Timeout(1);

    @Test
    public void testSolve1() throws Exception {
        Solver testedObject = new Solver();
        assertThat(testedObject.solve(1, 2, 0.0000001), closeTo(1.65, 0.01));
    }

    @Test
    public void testSolve3() throws Exception {
        Solver testedObject = new Solver();
        assertThat(testedObject.solve(3, 4, 0.0000001), closeTo(1.65, 3.64));
    }

    @Test
    public void testSolve4() throws Exception {
        Solver testedObject = new Solver();
        assertThat(testedObject.solve(4, 5, 0.0000001), closeTo(4.43, 0.01));
    }
}
