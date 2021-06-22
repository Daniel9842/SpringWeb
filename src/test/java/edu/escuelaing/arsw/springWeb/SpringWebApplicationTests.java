package edu.escuelaing.arsw.springWeb;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import edu.escuelaing.arsw.springWeb.picasYfamas.Game;
@SpringBootTest
class SpringWebApplicationTests {
	
	
	
	/**
	 * this test verifies that the program returns the correct number of picas
	 */
	@Test
	public void testFamas() {
		Game game = new Game();
		int nums[] = {1,2,3,4};
		int numsUser[] = {1,2,4,5};
		game.setNumbers(nums);
		game.numbers(numsUser);
		assertEquals(1,game.getFamas());
	}
	
	/**
	 * this test verifies that the program returns the correct number of picas
	 */
	@Test
	public void testPicas() {
		Game game = new Game();
		int nums[] = {1,2,3,4};
		int numsUser[] = {1,2,6,5};
		game.setNumbers(nums);
		game.numbers(numsUser);
		assertEquals(2,game.getPicas());
	}
	
}
