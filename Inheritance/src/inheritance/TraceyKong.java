package inheritance;

public class TraceyKong extends Student {

	public TraceyKong() {
		super("Tracey", "Kong", 2017, Main.COMP_SCI_MAJOR);
	}

	public TraceyKong(String name, String surname, int gradClass, Major major){
		super(name, surname, gradClass, major);
	}
	
	public void act(){
		while(true){
			super.act();
		}
	}

}
