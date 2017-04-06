package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class JiaMingMa extends ClubMember implements NetworkAdministrator, Spy{

	Message msg;
	ArrayList<Student> stus = Main.getAllStudents();
	public JiaMingMa() {
		super("Jia Ming", "Ma", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	
	public void act() {
		System.out.println("My name is " + getFirstName());
//		stateClub();
//		shakeHandsWithClub();
	}
	
	public void run() {
		while(true) {
			heal();
		}
	}
	
	public void receiveMessage(Message message) {
		for(Student s : stus) {
			if(s instanceof Soviet && !(s instanceof American) && s != this) {
				message.pass(this, s);
			}
		}
	}
	
	private void heal() {
		for(Student s : stus) {
			if(s instanceof NetworkAdministrator) {
				s.restore();
				System.out.println("Restored " + s.getFirstName());
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
