package inheritance;

public class EduardoRouse extends Student {

	public EduardoRouse() {
		super("Eduardo", "Rouse", 2017, Main.COMP_SCI_MAJOR);
	}
	
	public void act(){
		stateName();
		System.out.print("Who were you? Who are you?");
	}

}
