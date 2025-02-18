package edu.pitt.cs;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.*;
import org.mockito.*;

public class ValueTest {
	Value value;

	@Before
	public void setUp() {
		value = Mockito.mock(Value.class);
	}
	
	@Test
	public void testIncValNone() {
		Mockito.when(value.getVal()).thenReturn(0);
		verify(value,times(0)).incVal();
		assertEquals(0, value.getVal());
	}
	
	@Test
	public void testIncValOnce() {
		Mockito.when(value.getVal()).thenReturn(1);
		value.incVal();
		verify(value,times(1)).incVal();
		assertEquals(1, value.getVal());
	}

	@Test
	public void testIncValTwice() {
		Mockito.when(value.getVal()).thenReturn(2);
		value.incVal();
		value.incVal();
		verify(value,times(2)).incVal();
		assertEquals(2, value.getVal());
	}
}
