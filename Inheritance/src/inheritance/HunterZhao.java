package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class HunterZhao extends ClubMember implements Hacker, Soviet {

	public HunterZhao() {
		super("Hunter", "Zhao", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}

	public void act(){
		run();
		System.out.println("Hunter Zhao");
		for(int i = 0; i < Main.getAllStudents().size(); i++){
			if(Main.getAllStudents().get(i) instanceof ClubMember && ((ClubMember)Main.getAllStudents().get(i)).getClub().equals("roblox")){
				if(!Main.getAllStudents().get(i).getFirstName().equals("Hunter")){
					shakeHandsWith(Main.getAllStudents().get(i));
				}
			}
		}
	}

	public void run(){
		while(true){
			for(Student s: Main.getAllStudents()){
				if(s instanceof Hacker && !s.isAlive()){
					s.mutate();
				}else if(s instanceof NetworkAdministrator && s.isAlive()){
					s.corrupt();
				}
			}
		}
	}

	public void receiveMessage(Message message) {
		ArrayList<Student> array = Main.getAllStudents();
		ArrayList<Student> soviets = new ArrayList<Student>();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) != this && array.get(i) instanceof Soviet) {
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