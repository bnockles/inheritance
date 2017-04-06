package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class RyanSitu extends ClubMember implements Hacker,Soviet{

	private ArrayList<Student> students = Main.getAllStudents();

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
	
	public void receiveMessage(Message message){
		for(Student s: students){
			if(s instanceof Soviet){
				message.pass(this, s);
			}
		}
	}

}
