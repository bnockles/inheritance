package inheritance;

import java.util.ArrayList;

public class KristyLo extends ClubMember {
	private ArrayList<Student> students;

	public KristyLo() {
		super("Kristy", "Lo", 2017, Main.COMP_SCI_MAJOR, "coding for dummies");
	}
	
	public void act() {
//		super.act();
//		System.out.println("Kristy Here");
		for(Student s:students)
		{
			if (s instanceof ClubMember && ((ClubMember)s).getClub()== "coding for dummies")
			{
				shakeHandsWith(s);
			}
		}
		
		
	}

}


