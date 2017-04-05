package inheritance;

import java.util.ArrayList;

public class MatthewNguyen extends ClubMember {

	public MatthewNguyen() {
		super("Matthew", "Nguyen", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}
	
	public void act(){
		System.out.println("Matthew Nguyen");
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof ClubMember)
			if(((ClubMember) s).getClub().equals(getClub()))
				shakeHandsWith(s);
		}
		
	}
}
