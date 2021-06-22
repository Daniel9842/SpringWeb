package edu.escuelaing.arsw.springWeb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import edu.escuelaing.arsw.springWeb.picasYfamas.Game;

@SpringBootTest
class SpringWebApplicationTests {

	public void testPicas() {
		Game game = new Game();
		int nums[] = {1,2,3,4};
		int userNums[]= {8,2,3,1};
		game.setArgs(nums);
		game.numbers(userNums);
		assertEquals(2,game.getPicas());
	}

	public void testFamas() {
		Game game = new Game();
		int nums[] = {1,2,3,4};
		int userNums[]= {8,2,3,1};
		game.setArgs(nums);
		game.numbers(userNums);
		assertEquals(1,game.getFamas());
	}
	
}
