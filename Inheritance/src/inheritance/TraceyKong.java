package inheritance;

public class TraceyKong extends ClubMember implements NetworkAdministrator{

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
	
	public void run(){
		while(true){
			for(Student s: Main.getAllStudents()){
				if(s instanceof Hacker){
					((Hacker)s).createPatch();
				}else if(s instanceof NetworkAdministrator){
					((NetworkAdministrator)s).restore();
				}
			}
			
		} 
	}
}
