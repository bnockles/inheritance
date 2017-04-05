package inheritance;

import java.util.ArrayList;

public class KristyTan extends ClubMember {

	public KristyTan() {
		super("Kristy", "Tan", 2017, Main.COMP_SCI_MAJOR, "batman");
	}
	
	 public void act(){
		 System.out.println("Kristy Tan");
		 ArrayList<Student> students1 = Main.getAllStudents();
		 for(int i = 0; i < students1.size(); i++){
			 if(students1.get(i).getLastName() != "Tan" && ((ClubMember) students1.get(i)).getClub() == "batman"){
				 shakeHandsWith(students1.get(i));
			 }
		 }
	 }  
} 