package inheritance;

public class MahinKhan extends ClubMember{

	public MahinKhan() {
		super("Mahin", "Khan", 2017, Main.COMP_SCI_MAJOR, "tcg");
	}
	
	@Override
	public void act(){
		System.out.println("Mahin Khan");
	}

}
