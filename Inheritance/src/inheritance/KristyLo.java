package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class KristyLo extends ClubMember implements Hacker{
	private ArrayList<Student> students;

	public KristyLo() {
		super("Kristy", "Lo", 2017, Main.COMP_SCI_MAJOR, "coding for dummies");
	}
	
	public void act() {
//		super.act();
//		System.out.println("Kristy Here");
//		for(Student s:students)
//		{
//			if (s instanceof ClubMember && ((ClubMember)s).getClub()== "coding for dummies"&&(s.getFirstName())!="Kristy")
//			{
//				shakeHandsWith(s);
//				System.out.println("Shook hands with"+s);
//			}
//		}
		
		
	}
	public void run()
	{
		
//		students =Main.getAllStudents();
//		while(isAlive())
//		{
//			for (int i=0;i<students.size();i++)
//			{
//				
//				if(students.get(i) instanceof Hacker)
//				{
//					students.get(i).corrupt();
//				}
//				else
//				{
//					students.get(i).mutate();
//					
//				}
//			}
//		}
//
//			String message = "hello";
//			message.pass("ray",this.getFirstName());
		
	}
	public void receiveMessage(Message message)
	{
		for (Student s: students)
		{
			if (s.getFirstName() != "Kristy" && s instanceof Soviet)
			message.pass(this,s);
			
			
			
		}
	}
}


