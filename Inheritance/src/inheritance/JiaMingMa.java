package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class JiaMingMa extends ClubMember implements NetworkAdministrator, Soviet{

	Message msg;
	ArrayList<Student> stus = Main.getAllStudents();
	public JiaMingMa() {
		super("Hans", "Ma", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	
	public void act() {
//		System.out.println("My name is " + getFirstName());
//		stateClub();
//		shakeHandsWithClub();
	}
	
	public void run() {
//		while(true) {
//			heal();
//		}
	}
	
	public void receiveMessage(Message message) {
		ArrayList<Student> soviets = new ArrayList<Student>();
		for(Student s: Main.getAllStudents()){
			if(s instanceof Soviet  && !(s instanceof American)){
				soviets.add(s);
			}
		}
		if(soviets.indexOf(this) == soviets.size()-1){
			message.pass(this, soviets.get(0));
		}else{
			message.pass(this, soviets.get(soviets.indexOf(this)+1));
		}
	}
	
//	private void heal() {
//		for(Student s : stus) {
//			if(s instanceof NetworkAdministrator) {
//				s.restore();
//				System.out.println("Restored " + s.getFirstName());
//			}
//		}
//	}
//
//	private void shakeHandsWithClub() {
//		for(int i = 0; i < stus.size(); i ++) {
//			if(stus.get(i) instanceof ClubMember && stus.get(i) != this && ((ClubMember) stus.get(i)).getClub().equals("roblox")) {
//				shakeHandsWith(stus.get(i));
//			}
//		}
//	}
}
