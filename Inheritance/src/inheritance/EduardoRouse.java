package inheritance;

import java.util.ArrayList;

public class EduardoRouse extends ClubMember implements NetworkAdministrator{

	ArrayList<Student> students = Main.getAllStudents();
	
	public EduardoRouse() {
		super("Eduardo", "Rouse", 2017, Main.COMP_SCI_MAJOR, "esports");
	}
	
	public void act(){
		System.out.print("My name is "+getFirstName()+" "+getLastName()+". What are you? ");
		for(Student s:students){
			if(s instanceof ClubMember && ((ClubMember) s).getClub().equals(this.getClub()) && !s.equals(this)){
				this.shakeHandsWith(s);
			}
		}
	}
	
	public void run(){
		for(Student s:students){
			if(s instanceof Hacker && s.isAlive()){
				s.createPatch();
			}
			if(s instanceof NetworkAdministrator && !s.isAlive()){
				s.restore();
			}
		}
	}

}
