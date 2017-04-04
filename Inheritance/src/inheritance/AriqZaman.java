package inheritance;

public class AriqZaman extends Student {


	public AriqZaman() {
		super("Ariq", "Zaman", 2021, Main.COMP_SCI_MAJOR);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void act() {
		System.out.print("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		super.act();
	}

}