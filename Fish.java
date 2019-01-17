package petClasses;

import java.time.LocalDate;

public class Fish extends Pet {
	
	private wType waterType;

	public Fish(String petName, LocalDate petDOB, wType waterType) {
		super(petName, petDOB);
		this.waterType = waterType;
	}

	public wType getWaterType() {
		return waterType;
	}

	public void setWaterType(wType waterType) {
		this.waterType = waterType;
	}

	public Fish(String petName, wType waterType) {
		super(petName);
		this.waterType = waterType;
	}

	@Override
	String move(int howFar) {
		return getPetName() + " just swam " + howFar + " metres!\n";
	}

	@Override
	String makeNoise() {
		return getPetName()+ " just made a noise of deadly silence";
	}
	
	@Override
	public String getPetDetails() {
		String returnString = super.getPetDetails();
		returnString += "/n " + waterType + " water fish\n";
		return returnString;
	}

}
