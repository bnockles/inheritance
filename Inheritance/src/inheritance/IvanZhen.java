package inheritance;

public class IvanZhen extends Student {

	public IvanZhen() {
		// TODO Auto-generated constructor stub
	}

	public IvanZhen(String name, String surname, int gradClass, Major major) {
		super(name, surname, gradClass, major);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void act(){
		stateName();
	}

}
