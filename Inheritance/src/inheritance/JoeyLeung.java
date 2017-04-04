package inheritance;

public class JoeyLeung extends ClubMember {

	public JoeyLeung() {
		// TODO Auto-generated constructor stub
		super("Joey", "Leung", 2017, Main.COMP_SCI_MAJOR, "anime");
	}

	
	@Override
	public void act(){
		System.out.println("Joey Leung");
	}

}
