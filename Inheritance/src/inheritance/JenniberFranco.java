package inheritance;

public class JenniberFranco extends ClubMember {

	public JenniberFranco() {
		super("Jenniber", "Franco", 2017, Main.COMP_SCI_MAJOR, "K-Drama");
	}
	
	public void act(){
		super.act();
		System.out.print("I am in class right now.");
	}
}
