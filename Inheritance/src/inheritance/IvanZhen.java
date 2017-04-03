package inheritance;

public class IvanZhen extends ClubMember {

	public IvanZhen() {
		
		super("Seto" ,"Kaiba", 2017, Main.COMP_SCI_MAJOR,"tcg");
	}
//z

	@Override
	public void act(){
		stateName();
	}

}
