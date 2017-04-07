package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class KevinZheng extends ClubMember implements NetworkAdministrator, American, RealSoviet {

	public KevinZheng() {
		super("Kevin", "Zheng", 2021, Main.COMP_SCI_MAJOR, "roblox");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act() {
		System.out.print("MY GUY GOT MAD ROBLOX ####");
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
		Student hans = null;
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
