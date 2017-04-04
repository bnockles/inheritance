package inheritance;

import java.util.ArrayList;

public class TamannaHussain extends ClubMember implements Hacker{

	public TamannaHussain() {
		super("Tamanna", "Hussain", 2017, Main.COMP_SCI_MAJOR, "k-drama");
	}
	
	public void act(){
		System.out.println("My name is Tamanna Hussain and I am a student.");
		ArrayList<Student> members = Main.getAllStudents();
		for(Student c: members){
			if(((ClubMember) c).getClub().equals("k-drama") && 
					!((Student) c).getFirstName().equals("Tamanna")){
				shakeHandsWith(c);
			}
		}
	}

	public void run(){
		for(Student s: Main.getAllStudents())
			if(s instanceof NetworkAdministrator){
				corrupt();
			}
			else{
				restore();
			}
	}
}