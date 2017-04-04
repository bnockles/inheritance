package inheritance;

public class TraceyKong extends ClubMember {

	public TraceyKong() {
		super("Tracey", "Kong", 2017, Main.COMP_SCI_MAJOR, "k-drama");
	}
	  
	public void act(){
		System.out.println("My name is Tracey Kong.");
		shakeHands();
	}
  
	public void shakeHands(){
		for(Student s: Main.getAllStudents()){
			if(((ClubMember) s).getClub().equals(getClub()) && !(s.equals(this))){
				shakeHandsWith(s);
			}
		}
	}
}
