package inheritance;

public class BillyLuy extends ClubMember {
	
	public BillyLuy() {
		super("Billy", "Luy", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	
	@Override
	public void act(){
		System.out.println("BillyLuy");
		
	}

}
