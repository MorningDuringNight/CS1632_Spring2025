package edu.pitt.cs;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.mockito.*;

import io.cucumber.java.Before;

import org.junit.Test;

public class DeathStarTest {

	DeathStar pain;
	Planet Alderan;

	@Before
	public void setup(){

		pain = new DeathStar();
		Alderan = new Planet(10);

	}

	/**
	 * Write an integration test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetIntegration() {
		// TODO: Fill in!
		pain = new DeathStar();
		Alderan = new Planet(10);
		String dead = pain.shoot(Alderan);
		assertEquals("Wimpy planet was hit by the superlaser!", dead);
		assertEquals(-90,Alderan.getHitPoints());
	}

	/**
	 * Write an unit test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetUnit() {
		// TODO: Fill in!
		pain = new DeathStar();
		Alderan = mock(Planet.class);
		Mockito.when(Alderan.toString()).thenReturn("Wimpy planet");
		String dead = pain.shoot(Alderan);
		Mockito.when(Alderan.getHitPoints()).thenReturn(-90);
		assertEquals("Wimpy planet was hit by the superlaser!", dead);
		verify(Alderan,times(1)).damage(100);

	}
}
