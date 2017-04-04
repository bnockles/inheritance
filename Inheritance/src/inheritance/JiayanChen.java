package inheritance;

public class JiayanChen extends Student {

	public JiayanChen() {
		// TODO Auto-generated constructor stub
	}

	public JiayanChen(String name, String surname, int gradClass, Major major) {
		super("Jiayan", "Chen", 2017, Main.COMP_SCI_MAJOR);
		// TODO Auto-generated constructor stub
	}

	public void act()
	{
		stateName();
		stateMajor();
		stateStatus();
	} 

}
