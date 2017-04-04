package inheritance;

public class AhmedKhan extends ClubMember {

	public AhmedKhan() {
		super("Ahmed", "Khan", 2017, Main.COMP_SCI_MAJOR, "esports");
	}
	
	public void act(){
		System.out.println("What's poppin? It's Ahmed Khan.");
		shakeAllHands();
	}
	
	public void stateStatus() {
		System.out.print("After I complete "+getMajor().getCulminatingCourse()+", I'll make mad bank.");
	}
	
	public void shakeAllHands(){
		for(Student c: Main.getAllStudents()){
			ClubMember s = (ClubMember) c;
			if(s.getClub().equals(getClub()) && !(s instanceof AhmedKhan)){
				shakeHandsWith(c);
			}
		}
	}

}