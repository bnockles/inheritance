package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class AriqZaman extends ClubMember implements NetworkAdministrator, Soviet {

	public AriqZaman() {
		super("Ariq", "Zaman", 2021, Main.COMP_SCI_MAJOR, "roblox");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act() {
		System.out.print("AAAAAAA");
		super.act();

		for (int i = 0; i < Main.getAllStudents().size(); i++) {
			Student s = Main.getAllStudents().get(i);

			if (s instanceof ClubMember) {
				ClubMember c = (ClubMember) s;
				if (c.getClub().equals(this.getClub()) && !this.equals(s)) {
					shakeHandsWith(s);
				}
			}
		}
 
	}

	@Override
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
	@Override
	public void receiveMessage(Message message){
		ArrayList<Student> soviets = new ArrayList<Student>();
		for(Student s: Main.getAllStudents()){
			if(s instanceof Soviet  && !(s instanceof American)){
				soviets.add(s);
			}
			if(soviets.indexOf(this) == soviets.size()-1){
				message.pass(this, soviets.get(0));
			}else{
				message.pass(this, soviets.get(soviets.indexOf(this)+1));
			}
		}
	}
}