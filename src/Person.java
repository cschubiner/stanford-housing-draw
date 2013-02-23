import java.util.*;


public class Person {
	public ArrayList<Choice> choices;
	public String name;
	public int tier;
	public boolean alreadyInHouse = false;
	
	public Person(String name, int tier, ArrayList<Choice> choices){
		this.name = name;
		this.tier = tier;
		this.choices = choices;
		
	}
	
	public Person(String name, int tier){
		this.name = name;
		this.tier = tier;
		
	}
}
