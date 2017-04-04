package inheritance;

public class RayChen extends Student {

	public RayChen(String name, String surname, int gradClass, Major major) {
		super("Ray", "Chen", 2017, Main.COMP_SCI_MAJOR);
	}
	public void act(){
		System.out.println("Ray Chen");
	}
}
