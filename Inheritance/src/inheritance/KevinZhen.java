package inheritance;

public class KevinZhen extends Student{

	public KevinZhen() 
	{
		super("Kevin", "Zhen", 2017, Main.COMP_SCI_MAJOR);
		//testing
	}
	
	@Override
	public void act()
	{
		stateName();
	}
}
