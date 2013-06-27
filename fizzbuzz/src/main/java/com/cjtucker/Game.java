package com.cjtucker;

import java.util.ArrayList;
import java.util.List;

public class Game {
	List<GameChanger> fGameChangers = new ArrayList<GameChanger>();
	
	public Game(List<GameChanger> gameChangers) {
		fGameChangers = gameChangers;
	}
	
	public void run(int start, int end) {
		for (int i = start; i <= end; i++) {
			String line = "";
			for (GameChanger changer : fGameChangers) {
				line += changer.append(i);
			}
			if (line.isEmpty()) {
				line = new Integer(i).toString();
			}
			System.out.println(line);
		}
	}
}
