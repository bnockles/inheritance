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
	
	public void run() {Student hans = null;
	for (Student s : Main.getAllStudents()) {
		if (s.getFirstName().contains("Hans")) {
			hans = s;
			break;
		}
	}

	while (true) {
		Message m = new Main.Message();
		m.pass(this, hans);
	}
}

	@Override
	public void receiveMessage(Message message){
		ArrayList<Student> soviets = new ArrayList<Student>();
		for(Student s: Main.getAllStudents()){
			if(s instanceof RealSoviet  && !(s instanceof American)){
				soviets.add(s);
			}
		}
		if(soviets.indexOf(this) == soviets.size()-1){
			message.pass(this, soviets.get(0));
		}else{
			message.pass(this, soviets.get(soviets.indexOf(this)+1));
		}
	}
	
	
}
