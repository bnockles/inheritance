package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class MatthewYarmolinsky extends ClubMember implements Coder {

	public MatthewYarmolinsky() {
		super("Matthew", "Yarmolinsky", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}

	public void act() {
		System.out.print("#NotMyRodrick");
		System.out.print("Matthew Yarmolinsky");
		for (int i = 0; i < Main.getAllStudents().size(); i++) {
			if (Main.getAllStudents().get(i) instanceof ClubMember
					&& ((ClubMember) (Main.getAllStudents().get(i))).getClub().equals("pokemon")
					&& Main.getAllStudents().get(i) != this) {
				shakeHandsWith(Main.getAllStudents().get(i));
			}
		}
	}

	public void run() {
		while (true) {
			for (Student s : Main.getAllStudents()) {
				if (s instanceof NetworkAdministrator) {
					s.restore();
				}

				if (s instanceof Hacker) {
					s.createPatch();
				}
			}
		}
	}

	public void receiveMessage(Message message) {
		ArrayList<Student> players = Main.getAllStudents();
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).getFirstName().equals("Hans")) {
				message.pass(this, players.get(i));
			}
		}
	}
}
