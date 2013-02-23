import java.util.*;

public class House {
	private ArrayList<Person> people = new ArrayList<Person>();
	public String name;
	public int capacity;
	public int peopleInHouse = 0;
	
	public House(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
	
	public void addPerson(Person person){
		people.add(person);
		person.alreadyInHouse = true;
		peopleInHouse++;
	}
	
	public boolean hasSpaceLeft(){
		return capacity - peopleInHouse > 0;
	}
	
	public ArrayList<Person> getPeople(){
		return people;
	}
	
	@Override
	public String toString() {
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(name);
		sbuf.append(" contains the following people:");
		for (int i = 0; i < peopleInHouse; i++){
			sbuf.append("\n ");
			sbuf.append(i+1);
			sbuf.append(". \t");
			sbuf.append(people.get(i).name);
		}
		
		for (int i = peopleInHouse; i < capacity; i++){
			sbuf.append("\n ");
			sbuf.append(i+1);
			sbuf.append(". \t(empty)");
		}
		
		return sbuf.toString();
	}
}
