package inheritance;

import java.util.ArrayList;

public class RyanSitu extends ClubMember implements Hacker{

	private ArrayList<Student> students;

	public RyanSitu() {
		super("Ryan", "Situ", 2017, Main.COMP_SCI_MAJOR,"pokemon");
	}

	public void act(){
		//super.act();
		System.out.println("Ryan C2");
		students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof ClubMember && ((ClubMember) s).getClub() == "pokemon" && s.getFirstName()!="Ryan"){
				shakeHandsWith(s);
				System.out.println("I shook hands with"+s);
			}
		}
	}
	
	public void run(){
		for(Student s: students){
			if(s instanceof NetworkAdministrator){
				s.corrupt();
			}else{
				s.mutate();
			}
		}
	}

}
