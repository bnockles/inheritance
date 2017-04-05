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
				if(!s.equals(this) && ((ClubMember) s).getClub().equals(getClub()))
					shakeHandsWith(s);
		}
		
	}
	//corrupt restore
	//patch mutate
	public void run(){
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof Hacker && s.isAlive()){
				s.createPatch();
			}
			if(!s.equals(this) && s instanceof NetworkAdministrator && !s.isAlive()){
					s.restore();
			}
		}
	}
}
