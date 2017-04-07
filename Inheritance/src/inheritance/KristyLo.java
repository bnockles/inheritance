package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class KristyLo extends ClubMember implements Soviet,RealSoviet{
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
	public void receiveMessage(Message message) {
		ArrayList<Student> array = Main.getAllStudents();
		ArrayList<Student> soviets = new ArrayList<Student>();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) instanceof Soviet) {
				soviets.add(array.get(i));
			}
		}
		int index = soviets.indexOf(this);
		if (index + 1 > soviets.size()) {
			message.pass(this, soviets.get(0));	
		} else {
			message.pass(this, soviets.get(index + 1));	
			
		}		
	}
}


