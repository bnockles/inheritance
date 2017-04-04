package inheritance;

public class BenNockles extends ClubMember {

	public BenNockles() {
		super("Ben", "Nockles", 2003, Main.COMP_SCI_MAJOR, "pokemon");

	}
	
	public void act(){
//		super.act();
		System.out.println("Ben Nockles");
	}

}
