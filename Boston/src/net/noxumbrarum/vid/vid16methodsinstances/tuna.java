package net.noxumbrarum.vid.vid16methodsinstances;

public class tuna {
	private String girlName;
	
	public void setGirlName(String name){
		girlName = name;
	}
	
	public String getGirlName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first girlfriend was %s", getGirlName());
	}
}
