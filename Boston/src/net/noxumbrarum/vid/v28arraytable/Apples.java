package net.noxumbrarum.vid.v28arraytable;

public class Apples {

	public static void main(String[] args) {
		int[] array = {4, 8 , 16, 32, 64};
		
		System.out.println("Indes\tValue");

		for(int i = 0; i < array.length; i++){
			System.out.println(i + "\t" + array[i]);
		}
	}

}
