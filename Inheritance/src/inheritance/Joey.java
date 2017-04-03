package inheritance;

public class Joey extends Student {

	public Joey() {
		// TODO Auto-generated constructor stub
	}

	public Joey(String name, String surname, int gradClass, Major major) {
		super(name, surname, gradClass, major);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void act(){
		stateName();
	}

}
