package inheritance;

public class RayChen extends Student {

	public RayChen() {
		super("Ray", "Chen", 2017, Main.COMP_SCI_MAJOR);
	}
	public void act(){
		System.out.println(getFirstName()+" "+getLastName());
	}
}
