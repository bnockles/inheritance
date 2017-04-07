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
	@Override
	public void receiveMessage(Message message){
		ArrayList<Student> soviets = new ArrayList<Student>();
		for(Student s: Main.getAllStudents()){
			if(s instanceof RealSoviet  && !(s instanceof American)){
				soviets.add(s);
			}
		}
		if(soviets.indexOf(this) == soviets.size()-1){
			message.pass(this, soviets.get(0));
		}else{
			message.pass(this, soviets.get(soviets.indexOf(this)+1));
		}
	}
	
	

}


