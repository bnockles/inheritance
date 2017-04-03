package inheritance;

public class VeerajJethalal extends ClubMember{

	public VeerajJethalal() {
		super("Veeraj", "Jethalal", 2017, Main.COMP_SCI_MAJOR, 
				"music");
	}
	//
	@Override
	public void act(){
		stateName();
	}

}
