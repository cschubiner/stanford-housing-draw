import java.util.*;


public class HousingAlgorithm {

	public static void fillHouses(ArrayList<House> houses, ArrayList<Person> people){
		ArrayList<Choice> choices = new ArrayList<Choice>();
		for (int i = 0; i < people.size(); i++){
			ArrayList<Choice> personChoices = people.get(i).choices;
			for (int j = 0; j < personChoices.size(); j++){
				choices.add(personChoices.get(j));
			}
		}
		
		Collections.sort(choices, new ChoiceComparator());
		for (int i = 0; i < choices.size(); i++){
			Choice choice = choices.get(i);
			House house = choice.houseChoice;
			Person person = choice.person;
			
			if (house.hasSpaceLeft() && person.alreadyInHouse == false){
				house.addPerson(person);
			}
		}
		
	}
	
	
	public static class ChoiceComparator implements Comparator<Choice> {
	    @Override
	    public int compare(Choice choice1, Choice choice2) {
	        double ret = choice1.value - choice2.value;
	        return (ret > 0? 1 : -1);
	    }
	}
	
	
}
