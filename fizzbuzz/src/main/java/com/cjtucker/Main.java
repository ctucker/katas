package com.cjtucker;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] strings) {
		
		// Setup:
		List<GameChanger> changers = new ArrayList<GameChanger>();
		changers.add(new GameChangerMod(3, "FIZZ"));
		changers.add(new GameChangerMod(5, "BUZZ"));
		Game game = new Game(changers);
		
		// Run:
		game.run(1, 100);
	}
}
