package inheritance;

public class Hao extends Student {

	public Hao(String name, String surname, int gradClass, Major major) {
		super("Hao", "Yuan", 2017, Main.COMP_SCI_MAJOR);
	}
	
	public void act() {
		super.stateName();
	}
}
