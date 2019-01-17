package petClasses;

import java.time.LocalDate;

public abstract class Pet implements DailyActivity {
	public static int nextPetID = 10000;
	private int petID;
	private String petName;
	private LocalDate petDOB;
	private Activities[] dailyActivities;
	private String[] dailyTasks;

	public Pet(String petName, LocalDate petDOB) {
		nextPetID++;
		this.petID = nextPetID;
		this.petName = petName;
		this.petDOB = petDOB;
		this.dailyActivities = new Activities[10];
		this.dailyTasks = new String[10];
	}

	public Pet(String petName) {
		nextPetID++;
		this.petID = nextPetID;
		this.petName = petName;
		this.dailyActivities = new Activities[10];
		this.dailyTasks = new String[10];
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public LocalDate getPetDOB() {
		return petDOB;
	}

	public void setPetDOB(LocalDate petDOB) {
		this.petDOB = petDOB;
	}

	public int getPetID() {
		return petID;
	}

	public String getPetDetails() {
		String returnString = "Name: " + this.getPetName() + " (ID: " + getPetID() + ") \n";
		if (this.petDOB == null) {
			returnString += "DOB: unkown";
		} else {
			returnString += "DOB: " + this.petDOB;
		}
		return returnString;
	}

	public final String PRINT_PET_HEADER() {
		return (this.petName + " (ID: " + this.petID + ")");
	}

	abstract String move(int howFar);

	abstract String makeNoise();

	public Activities[] getDailyActivities() {
		return dailyActivities;
	}

	public String[] getDailyTasks() {
		return dailyTasks;
	}

	public void setDailyActivities(Activities[] dailyActivities) {
		this.dailyActivities = dailyActivities;
	}

	public void setDailyTasks(String[] dailyTasks) {
		this.dailyTasks = dailyTasks;
	}

	public int setActivity(Activities activity) {
		for (int i = 0; i < getDailyActivities().length; i++) {
			if (getDailyActivities()[i] == null) {
				getDailyActivities()[i] = activity;
				return i;
			}
			// break;
		}
		return -1;

	}
	@Override
	public void doDailyTask(String task) {
		for (int i = 0; i < getDailyTasks().length; i++) {
			if (getDailyTasks()[i] == null) {
				getDailyTasks()[i] = task;
			}
			break;
		}
}}
