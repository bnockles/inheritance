package inheritance;

public class GabrielHo extends ClubMember {

	public GabrielHo() {
		super("Gabriel", "Ho", 2017, Main.COMP_SCI_MAJOR, "anime");
	}
	
	public void act(){
		stateName();
		stateStatus();
		stateClub();
	}

}