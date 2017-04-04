package inheritance;

public class BenNockles extends ClubMember {

	public BenNockles() {
		super("Ben", "Nockles", 2003, Main.COMP_SCI_MAJOR, "k-pop");

	}
	
	public void act(){
		System.out.println("Ben Nockles is the teacher!");
	}
}
