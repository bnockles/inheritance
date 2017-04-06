package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class RayChen extends ClubMember implements NetworkAdministrator, Soviet{

	public RayChen() {
		super("Ray", "Chen", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}
	//:<
	public void act(){
		System.out.println("Hi I'm "+getFirstName()+" "+getLastName()+".");
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof ClubMember){
				if(!s.equals(this) && ((ClubMember)s).getClub().equals(getClub()))
					shakeHandsWith(s);
			}
		}
	}
	public void run(){
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof Hacker && s.isAlive()){
				s.createPatch();
			}
			else if(s instanceof NetworkAdministrator && !s.isAlive()){
				s.restore();
			}
		}
	}
	
	public void receiveMessage(Message m){
		ArrayList<Student> students = Main.getAllStudents();
		m.pass(this, students.get(0));
	}
}
