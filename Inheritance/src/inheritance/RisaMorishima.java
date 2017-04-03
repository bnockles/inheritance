package inheritance;

public class RisaMorishima extends ClubMember{

	public RisaMorishima() {
		super("Risa", "Morishima", 2017, Main.COMP_SCI_MAJOR, "break dance");
	}

	public void act(){
		stateName();
		stateClub();
	}
	
}
