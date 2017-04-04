package inheritance;

public class DavidSzymanski extends ClubMember {
	
	
	public DavidSzymanski(){
		super("David", "Szymanski", 2017, Main.COMP_SCI_MAJOR,"minecraft");
	}
	
	public void act(){
		System.out.println("David 'Sizzlemonkey' Szymanski");
	}
	
	public void stateStatus() {
		System.out.print("It is complete"+getMajor().getCulminatingCourse()+", I'll graduate in "+getGraduatingClass()+". ");
	}


	public void stateName(){
		System.out.print("\nMy name is bhabhi"+getFirstName()+" "+getLastName()+". ");
	}
	
	public void stateMajor(){
		System.out.print("Mayonaise "+getMajor().getName()+" waaaaaoooo. ");
	}
}
