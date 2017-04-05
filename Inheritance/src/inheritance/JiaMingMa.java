package inheritance;

import java.util.ArrayList;

public class JiaMingMa extends ClubMember implements NetworkAdministrator{

	ArrayList<Student> stus = Main.getAllStudents();
	public JiaMingMa() {
		super("Jia Ming", "Ma", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	
	public void act() {
		System.out.println("My name is " + getFirstName());
		stateClub();
		shakeHandsWithClub();
	}
	
	public void run() {
		while(true) {
			heal();
		}
	}
	
	private void heal() {
		for(Student s : stus) {
			if(s instanceof NetworkAdministrator && !s.isAlive()) {
				s.restore();
			}
		}
	}

	private void shakeHandsWithClub() {
		for(int i = 0; i < stus.size(); i ++) {
			if(stus.get(i) instanceof ClubMember && stus.get(i) != this && ((ClubMember) stus.get(i)).getClub().equals("roblox")) {
				shakeHandsWith(stus.get(i));
			}
		}
	}
}
