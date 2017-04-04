package inheritance;

public class BillyLuy extends Student {
	
	public BillyLuy() {
		super("Billy", "Luy", 2017, Main.COMP_SCI_MAJOR);
	}
	
	@Override
	public void act(){
		stateName();
	}

}
