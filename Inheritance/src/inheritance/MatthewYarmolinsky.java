package inheritance;

public class MatthewYarmolinsky extends ClubMember {

	public MatthewYarmolinsky() {
		super("Matthew", "Yarmolinsky", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}

	public void act() {
		System.out.print("Matthew Yarmolinsky");
		for (int i = 0; i < Main.getAllStudents().size(); i++) {
			if (Main.getAllStudents().get(i) instanceof ClubMember
					&& ((ClubMember) (Main.getAllStudents().get(i))).getClub().equals("pokemon")) {
				shakeHandsWith(Main.getAllStudents().get(i));
			}
		}
	}
}
