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
		// TODO Auto-generated constructor stub
		super("Victor", "Chen", 2017, Main.COMP_SCI_MAJOR, "anime");
	}
	
	public void act(){
//		System.out.println(this.getFirstName() + " " + this.getLastName());
		stateName();
		System.out.println("I have crippling Osteoporosis.");
	}

}
