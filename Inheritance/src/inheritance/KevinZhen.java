package inheritance;

public class KevinZhen extends ClubMember{

	public KevinZhen() 
	{
		super("Kevin", "Zhen", 2017, Main.COMP_SCI_MAJOR, "esports");
	}
	
	@Override
	public void act()
	{
		stateName();
	}
}
