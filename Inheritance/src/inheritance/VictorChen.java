/**
 * 
 */
package inheritance;

/**
 * @author hotfir
 *
 */
public class VictorChen extends ClubMember implements Hacker{

	public VictorChen() {
		super("Victor", "Chen", 2017, Main.COMP_SCI_MAJOR, "anime");
	}
	
	public void act(){
		System.out.println("Victor Chen is the student");
		System.out.println("I have crippling Osteoporosis.");
		
		for(Student s: Main.getAllStudents()){
			if(s != this && ((ClubMember) s).getClub().equals(this.getClub())){
				shakeHandsWith(s);
			}
		}
		
		for(Student s: this.getHandshakes()){
			System.out.println(s.getFirstName() + " " + s.getLastName() + " is in the " + this.getClub() + " club.");
		}
	}
	
	public void run(){
		for(Student s: Main.getAllStudents()){
			if(s instanceof NetworkAdministrator)
			s.corrupt();
			if(s instanceof Hacker)
			s.mutate();
		}
	}
}
