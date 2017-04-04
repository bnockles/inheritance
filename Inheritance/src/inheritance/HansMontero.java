package inheritance;

public class HansMontero extends Student {

	public HansMontero() {
		super();
	}

	public HansMontero(String name, String surname, int gradClass, Major major) {
		super(name, surname, gradClass, major);
		
	}
	
	public void act(){
		stateName();
		stateMajor();
		stateStatus();
	}
	
	public void stateStatus() {
		System.out.print("After I complete "+getMajor().getCulminatingCourse()+", I'll graduate in "+getGraduatingClass()+". ");
	}


	public void stateName(){
		System.out.print("\nMy name jeff xD jk my name is "+getFirstName()+" "+getLastName()+". ");
	}
	
	public void stateMajor(){
		System.out.print("I'm a "+getMajor().getName()+" major. Literally the best major.");
	}

}
