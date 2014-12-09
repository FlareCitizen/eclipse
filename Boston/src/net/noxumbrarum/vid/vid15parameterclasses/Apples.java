package net.noxumbrarum.vid.vid15parameterclasses;

import java.util.Scanner;

public class Apples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna tunaObj = new tuna();
		String name;
		
		System.out.println("Enter your name here: ");
		name = input.nextLine();
		
		tunaObj.simpleMsg(name);
	}

}
