
public class Choice {
	House houseChoice;
	int preferenceNumber;
	Person person;
	double value;
	
	public Choice(Person person, House houseChoice, int preferenceNumber){
		 this.person = person;
		 this.houseChoice = houseChoice;
		 this.preferenceNumber = preferenceNumber;
		 value = person.tier*preferenceNumber;
	}
}
