package net.noxumbrarum.vid.vid7;

import java.util.Scanner;

public class Apples {

	public static void main(String[] args) {
		
		double num1, num2, num3;
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		num1 = sc1.nextDouble();
		
		System.out.println("Enter second number: ");
		num2 = sc1.nextDouble();
		
		num3 = num1 + num2;
		
		System.out.println(num3);


	}

}
