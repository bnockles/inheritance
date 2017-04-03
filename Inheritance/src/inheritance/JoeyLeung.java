package inheritance;

public class JoeyLeung extends Student {

	public JoeyLeung() {
		// TODO Auto-generated constructor stub
	}

	public JoeyLeung(String name, String surname, int gradClass, Major major) {
		super(name, surname, gradClass, major);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void act(){
		stateName();
	}

}
