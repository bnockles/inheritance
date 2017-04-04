package inheritance;

public class JiaMingMa extends Student {

	public JiaMingMa() {
		super("Jia Ming", "Ma", 2017, Main.COMP_SCI_MAJOR);
	}
	
	public void act() {
		super.act();
		System.out.print("I'm 12 btw");
	}
}
