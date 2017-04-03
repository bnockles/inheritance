package inheritance;

public class MaxFriedman extends Student {

	public MaxFriedman() {
		super("Max", "Friedman", 2021, Main.COMP_SCI_MAJOR);
	}

	public MaxFriedman(String name, String surname, int gradClass, Major major) {
		super(name, surname, gradClass, major);
		// TODO Auto-generated constructor stub
	}
	
	public void act() {
		String str = " says ";
		for (int i = 0; i < ((int)(Math.random() * 200) + 200); i++) {
			str += (char) (33 + (int)(Math.random() * (125-33)));
		}
		System.err.print("Max Friedman");
		System.out.println(str);
	}

}
