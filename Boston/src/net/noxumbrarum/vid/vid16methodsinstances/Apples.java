package net.noxumbrarum.vid.vid16methodsinstances;

import java.util.Scanner;

public class Apples {

	public static void main(String[] args) {
		String temp;
		
		Scanner input = new Scanner(System.in);
		tuna tunaObj = new tuna();
		
		System.out.println("Enter name of your first girlfriend: ");
		temp = input.nextLine();
		
		tunaObj.setGirlName(temp);
		tunaObj.saying();

	}

}
