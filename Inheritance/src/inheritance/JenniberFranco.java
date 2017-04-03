package inheritance;

public class JenniberFranco extends Student {

	public JenniberFranco() {
		// TODO Auto-generated constructor stub
	}

	public JenniberFranco(String name, String surname, int gradClass, Major major) {
		super(name, surname, gradClass, major);
		// TODO Auto-generated constructor stub
	}
	
	public void act(){
		super.act();
		stateName();
		stateMajor();
		stateStatus();
		System.out.print("I am in class right now.");
	}
}
