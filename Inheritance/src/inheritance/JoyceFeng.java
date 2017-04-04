package inheritance;

import java.util.ArrayList;

public class JoyceFeng extends ClubMember {

	public JoyceFeng() {
		super("Joyce", "Feng", 2021, Main.COMP_SCI_MAJOR, "k-drama");
	}

	public void act(){

		System.out.println("\n Joyce Feng");
		System.out.println("I'm having a blast.");
		ArrayList<Student> students = Main.getAllStudents();
		for (int i = 0; i < students.size(); i++){
			ClubMember student = ((ClubMember)students.get(i));
			if(student != this){
				if (student.getClub().equals(this.getClub())) shakeHandsWith(student);
			}
		}
		System.out.println("These people are in the k-drama club:");
		for (int i = 0; i < getHandshakes().size(); i++){
			System.out.print(getHandshakes().get(i).getFirstName() + " ");
			
		}
		System.out.println("\n");
	}
	
	
}
