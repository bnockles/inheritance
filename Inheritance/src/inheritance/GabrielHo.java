package inheritance;

public class GabrielHo extends Student {

	public GabrielHo() {
		super("Gabriel", "Ho", 2017, Main.COMP_SCI_MAJOR);
	}
	/**
	public GabrielHo(String name, String surname, int gradClass, Major major) {
		super(name, surname, gradClass, major);
		// TODO Auto-generated constructor stub
	}
	**/
	
	public void act(){
		stateName();
		stateStatus();
	}

}
