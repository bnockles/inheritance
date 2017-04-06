package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class MatthewChu extends ClubMember implements Hacker, American{

	public MatthewChu() {
		super("Matthew", "Chu", 2017, Main.COMP_SCI_MAJOR, "batman");
	}

	public void act(){
		System.out.println("Matthew Chu");
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(((ClubMember) s).getClub().equals("batman") && !((ClubMember) s).getLastName().equals("Chu")){
				shakeHandsWith(s);
			}
		}
	}

	public void receiveMessage(Message message) {
		ArrayList<Student> students = Main.getAllStudents();
		for(int i = 0; i < students.size(); i++){
			if(students.get(i) instanceof American && students.get(i).getLastName().equals("Chu"))
				message.pass(this, students.get(17));
		}
	}

	public void run(){
		ArrayList<Student> students = Main.getAllStudents();
		while(this.isAlive()){
			for(Student s: students){
				if(s instanceof Hacker && s != this){
					if(!s.isAlive()){
						s.mutate();
					}
				}
				if(s instanceof NetworkAdministrator && s != this){
					if(s.isAlive()){
						s.corrupt();
					}
				}
			}
		}
	}
}


