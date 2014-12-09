package net.noxumbrarum.vid.vid17constructor;

public class Tuna {

	public Tuna(String name) {
		girlName = name;
	}
	
	private String girlName;
	
	public void setGirlName(String name){
		girlName = name;
	}
	
	public String getGirlName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first girlfriend was %s\n", getGirlName());
	}
}
