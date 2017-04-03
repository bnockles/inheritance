package inheritance;

public class MaxFriedman extends ClubMember {

	public MaxFriedman() {
		super("Max", "Friedman", 2021, Main.COMP_SCI_MAJOR, "k-pop is too expensive");
	}

	
	
	public void act() {
		String str = " says ";
		for (int i = 0; i < ((int)(Math.random() * 200) + 200); i++) {
			str += (char) (33 + (int)(Math.random() * (125-33)));
		}
		System.err.print("\nMax Friedman");
		System.out.println(str);
	}

}
