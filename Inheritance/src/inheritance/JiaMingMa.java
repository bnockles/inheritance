package inheritance;

import java.util.ArrayList;

public class JiaMingMa extends ClubMember {

	public JiaMingMa() {
		super("Jia Ming", "Ma", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	
	public void act() {
		System.out.println("JiaMingMa ");
		ArrayList<Student> stus = Main.getAllStudents();
		for(int i = 0; i < stus.size(); i ++) {
			if(stus.get(i) instanceof ClubMember && stus.get(i) != this && ((ClubMember) stus.get(i)).getClub() == "roblox") {
				shakeHandsWith(stus.get(i));
				System.out.println("I shook hands with " + stus.get(i).getFirstName());
			}
		}
	}
}
