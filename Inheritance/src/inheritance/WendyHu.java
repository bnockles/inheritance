package inheritance;

import java.util.ArrayList;

public class WendyHu extends ClubMember implements NetworkAdministrator{

	public WendyHu() {
		// TODO Auto-generated constructor stub
		super("Wendy","Hu",2021,Main.COMP_SCI_MAJOR, "anime");
	}
	
	@Override 
	public void act(){
		System.out.print("My name is Wendy Hu. ");
		
		ArrayList<Student> Students = Main.getAllStudents();
		for(Student s: Students)
		{
			if(s instanceof ClubMember && ((ClubMember) s).getClub().equals(this.getClub()) && !s.equals(this))
			{
				shakeHandsWith(s);
			}
		}
		
		
	}
	
	@Override
	public void run(){
		
		ArrayList<Student> Students = Main.getAllStudents();
		for(Student s: Students)
		{
			if(s instanceof Hacker)
			{
				s.createPatch();
			}
			else if (s instanceof NetworkAdministrator)
			{
				s.restore();
			}
		}
		
	}

}
  