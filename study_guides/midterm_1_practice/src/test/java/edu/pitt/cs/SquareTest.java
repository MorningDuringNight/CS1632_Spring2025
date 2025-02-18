package edu.pitt.cs;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.mockito.*;

import org.junit.Test;

public class SquareTest {


	Square squ;
	Number mun;
	/**
	 * Write an integration test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredIntegration() {
		// TODO: Fill in!
		squ = new Square();
		mun = new Number();

		squ.setSquared(mun, 3);
		assertEquals(9, mun.getVal());
	}

	/**
	 * Write a unit test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredUnit() {
		// TODO: Fill in!
		squ = new Square();
		mun = mock(Number.class);
		Mockito.when(mun.getVal()).thenReturn(9);

		squ.setSquared(mun, 3);
		
		verify(mun,times(1)).setVal(9);
	}
}
