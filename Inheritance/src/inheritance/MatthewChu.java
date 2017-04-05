package inheritance;

import java.util.ArrayList;

public class MatthewChu extends ClubMember {

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
	}


