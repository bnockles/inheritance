package inheritance;

public class RichardLy extends Student {

	public RichardLy() {
		// TODO Auto-generated constructor stub
		super("Richard", "Ly", 2017, Main.COMP_SCI_MAJOR);
	}

//	public RichardLy(String name, String surname, int gradClass, Major major) {
//		super(name, surname, gradClass, major);
//		// TODO Auto-generated constructor stub
//	}
	public void act(){
		stateName();
	}
}
