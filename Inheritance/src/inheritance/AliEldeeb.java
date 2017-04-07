package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class AliEldeeb extends ClubMember implements Hacker, Soviet {
	public AliEldeeb() {
		super("Ali", "Eldeeb", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}

	public void act() {
		System.out.println("Ali Eldeeb");
		for (Student a : Main.getAllStudents()) {
			if (((ClubMember) a).getClub().equals(getClub()) && a.getFirstName() != getFirstName()) {
				shakeHandsWith(a);
			}
		}
	}

	public void run() {
		while (true) {
			mutate();
		}
	}

	public void receiveMessage(Message m){
		ArrayList<Student> allStudents = Main.getAllStudents();
		ArrayList<Student> soviets = new ArrayList<Student>();
		for(int i = 0; i<allStudents.size(); i++){
			if(allStudents.get(i) instanceof Soviet)
				soviets.add(allStudents.get(i));
		}
		int index = soviets.indexOf(this);
		if(index == soviets.size()-1)
			m.pass(this, soviets.get(0));
		else
			m.pass(this, soviets.get(index+1));
	}
}//
