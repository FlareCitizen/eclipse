package net.noxumbrarum.vid.v23compundinterestprogram;

public class Apples {

	public static void main(String[] args) {
		double amount;
		double principal = 10000;
		double rate = .01;
		
		for(int i = 1; i <= 20; i++){
			amount = principal * Math.pow(1 + rate, i);
			System.out.println(i + "    " + amount);
		}

	}

}
