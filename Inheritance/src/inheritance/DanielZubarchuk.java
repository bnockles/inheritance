package inheritance;

public class DanielZubarchuk extends ClubMember{

	public DanielZubarchuk() {
		super("Daniel", "Zubarchuk", 2017, Main.COMP_SCI_MAJOR, "Soccer Club");
	}

	public void act(){
		stateName();
		stateStatus();
		stateClub();
	}
}
