/**
 * 
 */
package inheritance;

/**
 * @author hotfir
 *
 */
public class VictorChen extends Student {

	public VictorChen() {
		// TODO Auto-generated constructor stub
		super("Victor", "Chen", 2017, Main.COMP_SCI_MAJOR);
	}
	
	public void act(){
//		System.out.println(this.getFirstName() + " " + this.getLastName());
		super.act();
	}

}
