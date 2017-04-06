package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class WendyHu extends ClubMember implements NetworkAdministrator, American{
	
	private Student passed = null;

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
		int i = 0;
		this.restore();
		while(isAlive())
		{
			Student s = Students.get(i);
			if(s instanceof Hacker)
			{
				s.createPatch();
			}
			else if (s instanceof NetworkAdministrator)
			{
				s.restore();
			}
			if(i<Students.size())//ArrayIndexOutOfBound cuz each time mr.nockles remove a student the list is shortened
			{
				i++;
			}
			else
			{
				i = 0;
			}
		}
	}
	
	@Override
	public void receiveMessage(Message message){
		for(Student s: Main.getAllStudents())
		{
			if (s instanceof American && !(s instanceof Soviet) && s != this && passed != s)
			{
				passed = s;
				message.pass(this, s);
				break;
			}
		}
		
	}

}
  