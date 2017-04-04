package inheritance;

public class AliEldeeb extends ClubMember {
	private String firstName;
	private String lastName;

	public AliEldeeb() {
		super("Ali", "Eldeeb", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	public void act(){
		System.out.println("Ali Eldeeb");
	}
}
//fa