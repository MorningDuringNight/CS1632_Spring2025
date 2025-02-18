package edu.pitt.cs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;

public class Balltest {
    /**
 * <pre>
 * Preconditions: A Pitcher pitcher is created.
 * Execution steps: Call pitcher.addStress(10).
 * Postconditions: pitcher.getStress() returns 10.
 * </pre>
 */
@Test
public void testAddStress() {
	// TODO: Fill in
        Pitcher player = new Pitcher();
        player.addStress(10);
        int i = player.getStress();
        assertEquals(10, i);
    }
    /**
 * <pre>
 * Preconditions: A Pitcher pitcher is created.
 *                The pitcher always throws strikes.
 *                A Batter batter is created.
 *                The batter always swings bat.
 *                A BallGame game is created using pitcher and batter.
 * Execution steps: Call game.pitch().
 * Postconditions: The string "hit" is returned from the call.
 *                 Stress of 10 is added to the pitcher.
 * </pre>
 */
@Test
public void testPitch() {
	// TODO: Fill in
    Pitcher player;
    Batter bat;
    BallGame game;
    player = mock(Pitcher.class);
    Mockito.when(player.throwBall()).thenReturn(true);
    bat = mock(Batter.class);
    Mockito.when(bat.swingBat()).thenReturn(true);
    game = new BallGame(player, bat);
    assertEquals("hit",game.pitch());
    }
}

