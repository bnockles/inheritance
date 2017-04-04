package inheritance;

public class HansMontero extends Student {

	public HansMontero() {
		super("Hans", "Montero", 2017, Main.COMP_SCI_MAJOR);
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
