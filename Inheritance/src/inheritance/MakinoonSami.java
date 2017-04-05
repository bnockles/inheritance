package inheritance;

import java.util.ArrayList;

public class MakinoonSami extends ClubMember {

	public MakinoonSami() {
		super("Makinoon", "Sami", 2017, Main.COMP_SCI_MAJOR, "batman");
	
	
	}
	
	public void act(){
		System.out.println("Makinoon Sami");
		ArrayList<Student> studentList = Main.getAllStudents(); 
		
		for ( int i = 0; i < studentList.size(); i ++){ 
			if( studentList.get(i) instanceof ClubMember
					&& ((ClubMember) studentList.get(i)).getClub().equals("batman")){ 
				shakeHandsWith(studentList.get(i)); 
			}
			
		}
		
	}
	

}
