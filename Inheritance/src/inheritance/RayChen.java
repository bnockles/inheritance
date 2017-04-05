package inheritance;

import java.util.ArrayList;

public class RayChen extends ClubMember {

	public RayChen() {
		super("Ray", "Chen", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}
	//:<
	public void act(){
		System.out.println("Hi I'm "+getFirstName()+" "+getLastName()+".");
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof ClubMember && s.getFirstName() != getFirstName() && s.getLastName() != getLastName()){
				if(((ClubMember) s).getClub().equals(getClub()))
					shakeHandsWith(s);
			}
		}
	}
}
