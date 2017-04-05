package inheritance;

import java.util.ArrayList;

public class JonathanZheng extends ClubMember {

	public JonathanZheng() {
		super("Jonathan", "Zheng", 2017, Main.COMP_SCI_MAJOR, "batman");
		// TODO Auto-generated constructor stub
	}
	
	public void act(){
//		System.out.println("Jonathan Zheng");
		ArrayList<Student> students = Main.getAllStudents();
		for(int i = 0; i < students.size(); i++){
			if(((ClubMember) students.get(i)).getClub() == "batman"){
				shakeHandsWith(students.get(i));
			}
		}
		getHandshakes();
	}

	
}
