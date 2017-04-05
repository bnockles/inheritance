package inheritance;

import java.util.ArrayList;

public class VickiLau extends ClubMember {
	public VickiLau() {
		super("Vicki", "Lau", 2021, Main.COMP_SCI_MAJOR, "coding for dummies");
	}
	
	public void act() {
		ArrayList<Student> array = Main.getAllStudents();
		for (int i = 0; i < array.size(); i++) {
			ClubMember clubM = (ClubMember)(array.get(i));
			if (clubM.getClub() == this.getClub() && clubM != this) {
				shakeHandsWith(array.get(i));
			}
		}
	}
}
