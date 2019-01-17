package petClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PetTester {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Dog p1 = new Dog("Spot");
		Dog p2 = new Dog("Bill", LocalDate.of(2012, 5, 3));
		Fish p3 = new Fish("Nemo", LocalDate.of(2016, 9, 9), wType.SALT);
		Fish p4 = new Fish("Dory", wType.FRESH);

		ArrayList<Pet> myPets = new ArrayList<Pet>();
		myPets.add(p1);
		myPets.add(p2);
		myPets.add(p3);
		myPets.add(p4);

		for (Pet eachPet : myPets) {
			System.out.println(eachPet.getPetDetails());
		}

		System.out.println();
		for (Pet eachPet : myPets) {
			System.out.println(eachPet.PRINT_PET_HEADER());
			if (eachPet instanceof Dog) {
				System.out.println(((Dog) eachPet).wagTail());
			}
		}

		assignDailyActivities(myPets);

		System.out.println();
		for (Pet eachPet : myPets) {
			System.out.println("\n" + eachPet.PRINT_PET_HEADER());
			System.out.print("ACTIVITIES: ");
			for (Activities eachActivity : eachPet.getDailyActivities()) {
				System.out.print(eachActivity + ", ");
			}
			System.out.println();

			System.out.print("TASKS: ");
			for (String eachTask : eachPet.getDailyTasks()) {
				System.out.print(eachTask + ", ");
			}
			System.out.println();
		}
	}

	public static void assignDailyActivities(ArrayList<Pet> myPets) {
		System.out.println("Please select a pet to add an activity to:");
		int index = 0;
		for (Pet eachPet : myPets) {
			System.out.println((index + 1) + ": " + eachPet.getPetID() + " - (" + eachPet.getPetName() + ")");
			index++;
		}
		System.out.println("Please type the number of the pet: ");
		int petChosen = sc.nextInt() - 1;
		System.out.println("Please select an activity for today " + LocalDate.now());
		for (int i = 0; i < Activities.values().length; i++) {
			System.out.println((i + 1) + ": " + Activities.values()[i].description());
		}
		System.out.println("Please type the number of the daily activity: ");
		int activityChosen = sc.nextInt() - 1;
		Activities activity = Activities.values()[activityChosen];
		int activityLocation = myPets.get(petChosen).setActivity(activity);

		for (int i = 0; i < myPets.get(petChosen).getDailyActivities().length; i++) {
			System.out.println(myPets.get(petChosen).getDailyActivities()[i]);
		}

		System.out.println("Now please add a daily task for the activity " + activity.description());
		for (int i = 0; i < myPets.get(petChosen).getDailyActivities()[activityLocation].activity().length; i++) {
			System.out.println(
					(i + 1) + ": " + myPets.get(petChosen).getDailyActivities()[activityLocation].activity()[i]);
		}

		System.out.println("Please type the number of the daily task: ");
		int taskChosen = sc.nextInt() - 1;
		String task = myPets.get(petChosen).getDailyActivities()[activityLocation].activity()[taskChosen];
		myPets.get(petChosen).doDailyTask(task);
	}

}
