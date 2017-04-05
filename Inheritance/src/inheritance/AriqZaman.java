package inheritance;

public class AriqZaman extends ClubMember {

	public AriqZaman() {
		super("Ariq", "Zaman", 2021, Main.COMP_SCI_MAJOR, "roblox");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act() {
		System.out.print("AAAAAAA");
		super.act();

		for (int i = 0; i < Main.getAllStudents().size(); i++) {
			Student s = Main.getAllStudents().get(i);

			if (s instanceof ClubMember) {
				ClubMember c = (ClubMember) s;
				if (c.getClub().equals(this.getClub()) && !this.equals(s)) {
					shakeHandsWith(s);
				}
			}
		}
	}

}