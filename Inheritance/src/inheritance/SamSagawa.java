package inheritance;

public class SamSagawa extends ClubMember {

	public SamSagawa() {
		super("Sam", "Sagawa", 2021, Main.COMP_SCI_MAJOR, "esports");
	}
	
	@Override
	public void act(){
		System.out.println("Sam Sagawa does, in fact, know what he's doing.");
		stateName();
		stateMajor();
		stateStatus();
		stateClub();
	}

}
