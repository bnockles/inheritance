package inheritance;

public class Hao extends Student {

	public Hao() {
		super("Hao", "Yuan", 2017, Main.COMP_SCI_MAJOR);
	}
	
	public void act() {
		super.stateName();
	}
}
