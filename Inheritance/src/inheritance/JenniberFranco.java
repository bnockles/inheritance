package inheritance;

public class JenniberFranco extends Student {

	public JenniberFranco() {
		super("Jenniber", "Franco", 2017, Main.COMP_SCI_MAJOR);
	}
	
	public void act(){
		super.act();
		System.out.print("I am in class right now.");
	}
}
