package inheritance;

public class AliEldeeb extends Student {
	private String firstName;
	private String lastName;

	public AliEldeeb() {
		super("Ali", "Eldeeb", 2017, Main.COMP_SCI_MAJOR);
	}
	public void act(){
		System.out.println("Ali Eldeeb");
	}
}
