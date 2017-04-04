package inheritance;

public class DavidSzymanski extends Student {
	
	
	public DavidSzymanski(){
		super("David", "Szymanski", 2017, Main.COMP_SCI_MAJOR);
	}
	
	
	public void act(){
		stateName();
		stateMajor();
		stateStatus();
	}
	
	public void stateStatus() {
		System.out.print("It is complete"+getMajor().getCulminatingCourse()+", I'll graduate in "+getGraduatingClass()+". ");
	}


	public void stateName(){
		System.out.print("\nMy name is babi"+getFirstName()+" "+getLastName()+". ");
	}
	
	public void stateMajor(){
		System.out.print("Mayonaise "+getMajor().getName()+" major. ");
	}
}
