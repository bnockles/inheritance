package inheritance;

public class SammyajitKapuria extends Student {

	public SammyajitKapuria() {
		super("Sammy", "Kapuria",2017,Main.COMP_SCI_MAJOR);
	}
	
	public void act(){ 
		super.act();
		System.out.println("sAMmy");
	}
}
