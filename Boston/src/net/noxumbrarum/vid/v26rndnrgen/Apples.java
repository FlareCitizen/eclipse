package net.noxumbrarum.vid.v26rndnrgen;

import java.util.Random;

public class Apples {

	public static void main(String[] args) {
		Random dice = new Random();
		
		int number;
		
		for(int i = 1; i <= 10; i++){
			number = dice.nextInt(6) + 1;
			System.out.println(number);
		}

	}

}
