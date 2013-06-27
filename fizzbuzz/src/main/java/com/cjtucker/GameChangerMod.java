package com.cjtucker;

public class GameChangerMod implements GameChanger {
	private final int fDivisor;
	private final String fResult;
	
	public GameChangerMod(int divisor, String result) {
		fDivisor = divisor;
		fResult = result;
	}
	
	public String append(int input) {
		String result = "";
		if (input % fDivisor == 0) {
		  result = fResult;
		}
		return result;
	}
}
