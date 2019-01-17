package petClasses;

import java.time.LocalDate;

public class Dog extends Pet {

	public Dog(String petName, LocalDate petDOB) {
		super(petName, petDOB);
	}

	public Dog(String petName) {
		super(petName);
	}

	@Override
	String move(int howFar) {
		return getPetName() + " just ran " + howFar + " metres! \n";
	}

	@Override
	String makeNoise() {
		return getPetName() + " just barked \n";
	}
	
	public String wagTail() {
		return getPetName() + " just wagged their tail! \n";
	}

	

}
