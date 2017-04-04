/**
 * 
 */
package inheritance;

/**
 * @author hotfir
 *
 */
public class VictorChen extends ClubMember {

	public VictorChen() {
		super("Victor", "Chen", 2017, Main.COMP_SCI_MAJOR, "anime");
	}
	
	public void act(){
		System.out.println("Victor Chen is the student");
		System.out.println("I have crippling Osteoporosis.");
		
		for(Student s: Main.getAllStudents()){
			if(((ClubMember) s).getClub().equals(this.getClub())){
				shakeHandsWith(s);
			}
		}
		
		for(Student s: this.getHandshakes()){
			System.out.println(s.getFirstName() + " " + s.getLastName());
		}
	}

}
