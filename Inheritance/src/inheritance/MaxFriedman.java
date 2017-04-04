package inheritance;

public class MaxFriedman extends ClubMember {

	public MaxFriedman() {
		super("Max", "Friedman", 2021, Main.COMP_SCI_MAJOR, "k-pop");
	}

	
	
	public void act() {
//		for (int i = 0; i < 100; i++) {
//			System.out.print("\n");
//		}
//		for (int h = 0; h < 30; h++) {
//			String str = "";
//
//			for (int i = 0; i < ((int)(Math.random() * 200) + 200); i++) {
//				str += (char) (33 + (int)(Math.random() * (125-33)));
//			}
//			System.out.println(str);
//		}
		
		System.err.println("\nMax Friedman\n");
		
		shakeClubHands();
	}
	
	private void shakeClubHands(){
		for (int i = 0; i < Main.getAllStudents().size(); i++) {
			if (((ClubMember) (Main.getAllStudents().get(i))).getClub() == this.getClub()) {
				shakeHandsWith(Main.getAllStudents().get(i));
			}
		}
	}

}
