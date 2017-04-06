package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class AnnaHo extends ClubMember implements Soviet{
	
	private ArrayList<Student> students;

	public AnnaHo() {
		super("Anna", "Ho", 2017, Main.COMP_SCI_MAJOR, "batman");
 
	} 
	
	public void act(){
		//super.act();
		//System.out.println("Anna Ho");
		Main.getAllStudents();
		for (Student s: students){
			if(s instanceof ClubMember && ((ClubMember)s).getClub() == "batman"){
				shakeHandsWith(s);
				System.out.println("shook hands with" + s);
			}
		}
	}
	
	public void run(){
		while(isAlive()){
			for (int i= 0 ;i <Main.getAllStudents().size(); i++){ 
				if(Main.getAllStudents().get(i) instanceof Hacker){
					Main.getAllStudents().get(i).corrupt();
				}
				else{
					Main.getAllStudents().get(i).mutate();
				}
			}
		}
	}
	
//	String message = "hello world";
//	message.pass(this, );
	
	public void receiveMessage(Message message) {
		for(Student s : Main.getAllStudents())
			if(s instanceof Soviet && !(s instanceof American) && !s.equals(this))
				message.pass(this, s); 
		
	}
}
