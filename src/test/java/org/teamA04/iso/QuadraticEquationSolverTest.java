package org.teamA04.iso;
import org.junit.Test;
import static org.junit.Assert.*;

	public class QuadraticEquationSolverTest {

	    @Test
	    public void testTwoRealRoots() {
	        double a = 1;
	        double b = -3;
	        double c = 2;

	        Object[] roots = QuadraticEquationSolver.calculateRoots(a, b, c);

	        assertEquals(2, roots.length);
	        assertEquals(2.0, (double) roots[0], 0.001);
	        assertEquals(1.0, (double) roots[1], 0.001);
	    }

	    @Test
	    public void testOneRealRoot() {
	        double a = 1;
	        double b = -2;
	        double c = 1;

	        Object[] roots = QuadraticEquationSolver.calculateRoots(a, b, c);

	        assertEquals(1, roots.length);
	        assertEquals(1.0, (double) roots[0], 0.001);
	    }

	    @Test
	    public void testTwoComplexRoots() {
	        double a = 1;
	        double b = 2;
	        double c = 5;
	        
	        Object[] roots = QuadraticEquationSolver.calculateRoots(a, b, c);
	        assertEquals(2, roots.length);
	        assertTrue(roots[0] instanceof Complex);
	        assertTrue(roots[1] instanceof Complex);
	        Complex root1 = (Complex) roots[0];
	        Complex root2 = (Complex) roots[1];
	        assertEquals(-1.0, root1.getReal(), 0.001);
	        assertEquals(2.0, root1.getImaginary(), 0.001);
	        assertEquals(-1.0, root2.getReal(), 0.001);
	        assertEquals(-2.0, root2.getImaginary(), 0.001);
	    }
	}


