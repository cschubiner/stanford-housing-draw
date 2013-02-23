import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class HousingTest {

	@Test
	public void emptyTest() {
		
	}
	
	@Test
	public void simpleTest() {
		ArrayList<House> houses = new ArrayList<House>();
		House floMo = new House("FloMo", 1);
		House toyon = new House("Toyon", 1);
		houses.add(floMo);
		houses.add(toyon);
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		Person nikhil = new Person("Nikhil", 0); //This means you're tier 1
		nikhil.choices = new ArrayList<Choice>();
		nikhil.choices.add(new Choice(nikhil, floMo, 0));
		nikhil.choices.add(new Choice(nikhil, toyon, 1));
		people.add(nikhil);
		
		Person clay = new Person("Clay", 2); //This means I'm tier 3
		clay.choices = new ArrayList<Choice>();
		clay.choices.add(new Choice(clay, floMo, 1));
		clay.choices.add(new Choice(clay, toyon, 0));
		people.add(clay);
		
		HousingAlgorithm.fillHouses(houses,people);
		System.out.println(floMo);
		System.out.println(toyon);
		assertTrue(floMo.getPeople().contains(nikhil));
		assertTrue(floMo.getPeople().contains(clay) == false);
		assertTrue(toyon.getPeople().contains(clay));
		assertTrue(toyon.getPeople().contains(nikhil) == false);
		
	}

}
