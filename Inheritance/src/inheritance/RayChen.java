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
}
