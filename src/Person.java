import java.util.*;


public class Person {
	public ArrayList<Choice> choices;
	public String name;
	public int tier;
	
	public Person(String name, int tier, ArrayList<Choice> choices){
		this.name = name;
		this.tier = tier;
		this.choices = choices;
		//test
	}
	
	public Person(String name, int tier){
		this.name = name;
		this.tier = tier;
		
	}
}
