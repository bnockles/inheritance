package inheritance;

public class ZhengLu extends Student {
	
	private String food;
	
	public ZhengLu() {
		super("Zheng", "Lu", 2017, Main.COMP_SCI_MAJOR);
		food = "potatoes";
	}

	public ZhengLu(String name, String surname, int gradClass, Major major) {
		super(name, surname, gradClass, major);
		food = "potatoes";
	}
	
	public void act()
	{
		super.act();
		stateClub();
	}
	
	public void stateClub() {
		System.out.print("I also like " + food + ".");
	}

}
