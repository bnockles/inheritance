package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class MatthewNguyen extends ClubMember implements Soviet{

	public MatthewNguyen() {
		super("Matthew", "Nguyen", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}
	
	public void act(){
		System.out.println("Matthew Nguyen");
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof ClubMember)
				if(!s.equals(this) && ((ClubMember) s).getClub().equals(getClub()))
					shakeHandsWith(s);
		}
		
	}
	//corrupt restore
	//patch mutate
	public void run(){
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof Hacker && s.isAlive()){
				s.createPatch();
			}
			if(s instanceof NetworkAdministrator && !s.isAlive()){
					s.restore();
			}
		}
	}
	public void receiveMessage(Message m){
		/*
		ArrayList<Student> students = Main.getAllStudents();
		m.pass(this, students.get(0));
		students.remove(0);
		//(int)Math.random()*students.size()
		 * 
		*/
		ArrayList<Student> students = Main.getAllStudents();
		for (Student s : students) {
			 if(s instanceof Soviet && !(s instanceof American) && !s.equals(this)){
				 m.pass(this, s);
				 break;
			 }
		}
	} 
}
