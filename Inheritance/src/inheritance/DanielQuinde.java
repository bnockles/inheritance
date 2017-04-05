package inheritance;

import java.util.ArrayList;

public class DanielQuinde extends ClubMember {
	public DanielQuinde(){
		super("Daniel", "Quinde", 2017, Main.COMP_SCI_MAJOR,"batman");

	}	
	public void act(){
		ArrayList<Student> studentList =  Main.getAllStudents();
		
		for(int i =0; i<studentList.size();i++){
			if(((ClubMember) studentList.get(i)).getClub().equals("batman")&&studentList.get(i).getFirstName()!=getFirstName()){
				shakeHandsWith(studentList.get(i));

			}
		}
		
		
		System.out.println("Daniel Quinde");
	}

}

