package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class VickiLau extends ClubMember implements Hacker, Soviet, RealSoviet {
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
	
	public void run() {
//		ArrayList<Student> array = Main.getAllStudents();
//		while(true) {
//			this.mutate();
//			System.out.println("i cannot die");
//			for (int i = 0; i < array.size(); i++) {
//				if (array.get(i) instanceof NetworkAdministrator && array.get(i).isAlive()) {
//					array.get(i).corrupt();
//					System.out.println("heyo buddyo" + array.get(i));
//				}
//			}
//		}
	}
	
	public void receiveMessage(Message message) {
		ArrayList<Student> array = Main.getAllStudents();
		ArrayList<Student> soviets = new ArrayList<Student>();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) instanceof RealSoviet) {
				soviets.add(array.get(i));
			}
		}
		int index = soviets.indexOf(this);
		if (index + 1 > soviets.size()) {
			message.pass(this, soviets.get(0));	
		} else {
			message.pass(this, soviets.get(index + 1));	
		}		
	}
	
	
}
