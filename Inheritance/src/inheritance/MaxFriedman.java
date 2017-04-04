package inheritance;

public class MaxFriedman extends ClubMember {

	public MaxFriedman() {
		super("Max", "Friedman", 2021, Main.COMP_SCI_MAJOR, "k-pop");
	}

	
	
	public void act() {
		System.err.print("\nMax Friedman");
		String str = " says ";
		for (int h = 0; h < 10; h++) {

			for (int i = 0; i < ((int)(Math.random() * 200) + 200); i++) {
				str += (char) (33 + (int)(Math.random() * (125-33)));
			}
			System.out.println(str);
		}
	}

}
