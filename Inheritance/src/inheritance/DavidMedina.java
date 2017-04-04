package inheritance;

public class DavidMedina extends Student {

	public DavidMedina() {
		// TODO Auto-generated constructor stub
		super("David", "Medina", 2021, new Major("Computer Science", "CS"));
	}

	public DavidMedina(String name, String surname, int gradClass, Major major) {
		super(name, surname, gradClass, major);
		// TODO Auto-generated constructor stub
	}
	
	public void act(){
		stateName();
		stateMajor();
		stateStatus();
	}
	
	

}
