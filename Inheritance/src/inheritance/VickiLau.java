package inheritance;

public class VickiLau extends Student {
	public VickiLau() {
		super("Vicki", "Lau", 2021, Main.COMP_SCI_MAJOR);
	}
	
	public void act() {
		System.out.println("Heyo this is an override");
		stateName();
	}
}
