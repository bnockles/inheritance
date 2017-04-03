package inheritance;

public class JoyceFeng extends Student {

	public JoyceFeng() {
		// TODO Auto-generated constructor stub
	}

	public JoyceFeng(String name, String surname, int gradClass, Major major) {
		super("Joyce", "Feng", 2021, Main.COMP_SCI_MAJOR);
		// TODO Auto-generated constructor stub
	}

	public void act(){
		stateName();
		System.out.print("I'm having a blast.");
	}
}
