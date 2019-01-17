package petClasses;

public enum Activities {
	EAT {
		@Override
		String description() {
			return "Eat";
		}

		@Override
		String[] activity() {
			String[] activity = {"breakfast", "lunch", "dinner", "snack"};
			return activity;
		}
	}, EXERCISE {
		@Override
		String description() {
			
			return "Exercise";
		}

		@Override
		String[] activity() {
			String[] activity = {"walk", "play ball", "hide in castle", "swim round bowl"};
			return activity;
		}
	}, MEDICATION {
		@Override
		String description() {
			
			return "Medication";
		}

		@Override
		String[] activity() {
			String[] activity = { "vitamins", "injection", "tablets for epilespsy"};
			return null;
		}
	}, SLEEP {
		@Override
		String description() {
			
			return "Sleep";
		}

		@Override
		String[] activity() {
			String[] activity = {"just keep swim", "nap", "bedtime"};
			return null;
		}
	};
	
	abstract String description();
	abstract String[] activity();

}
