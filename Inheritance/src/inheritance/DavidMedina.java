package inheritance;

public class DavidMedina extends Student {

	public DavidMedina() {
		// TODO Auto-generated constructor stub
		super("David", "Medina", 2017, Main.COMP_SCI_MAJOR);
	}

	public DavidMedina(String name, String surname, int gradClass, Major major) {
		super(name, surname, gradClass, major);

	}
	
	public void act(){
		stateName();
		stateMajor();
		stateStatus();
	}
	
	

}
