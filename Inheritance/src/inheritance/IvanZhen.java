package inheritance;

public class IvanZhen extends ClubMember {

	public IvanZhen() {
		//ivan
		super("Seto" ,"Kaiba", 2017, Main.COMP_SCI_MAJOR,"tcg");
	}


	@Override
	public void act(){
		stateName();
	}

}
