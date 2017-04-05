package inheritance;

import java.util.ArrayList;

public class SammyajitKapuria extends ClubMember {

	public SammyajitKapuria() {
		super("Sammy", "Kapuria",2017,Main.COMP_SCI_MAJOR,"pokemon");
	}
	
	public void act(){ 
		//super.act();
		System.out.println("sAMmy");
		ArrayList<Student> allStudents = Main.getAllStudents();
		for(Student s: allStudents){
			if(s instanceof ClubMember && ((ClubMember) s).getClub()=="pokemon"&&s.getFirstName()!="Sammy"){
				shakeHandsWith(s);
				System.out.println("I shook hands with "+s+ " !");
			}
		}
		
	} 
}


