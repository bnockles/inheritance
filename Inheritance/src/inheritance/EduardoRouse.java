package inheritance;

import java.util.ArrayList;

public class EduardoRouse extends ClubMember {

	public EduardoRouse() {
		super("Eduardo", "Rouse", 2017, Main.COMP_SCI_MAJOR, "esports");
	}
	
	public void act(){
		System.out.print("My name is "+getFirstName()+" "+getLastName()+". What are you? ");
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s:students){
			if(s instanceof ClubMember && ((ClubMember) s).getClub().equals(this.getClub()) && !s.equals(this)){
				this.shakeHandsWith(s);
			}
		}
	}

}
