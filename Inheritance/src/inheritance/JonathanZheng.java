package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class JonathanZheng extends ClubMember implements Soviet{

	public JonathanZheng() {
		super("Jonathan", "Zheng", 2017, Main.COMP_SCI_MAJOR, "batman");
		// TODO Auto-generated constructor stub
	}
	
	public void act(){
		run();
//		System.out.println("Jonathan Zheng");
		ArrayList<Student> students = Main.getAllStudents();
		for(int i = 0; i < students.size(); i++){
			if(students.get(i).getFirstName() != "Jonathan" && ((ClubMember) students.get(i)).getClub() == "batman"){
				shakeHandsWith(students.get(i));
			}
		}
	}
	
	public void run(){
		ArrayList<Student> students = Main.getAllStudents();
		for(int i = 0; i < students.size(); i++){
			if(students.get(i) instanceof Hacker && isAlive()){
				students.get(i).createPatch();
			}
			if(students.get(i) instanceof NetworkAdministrator && isAlive() == false && students.get(i).getFirstName().equals("Jonathan")){
				students.get(i).restore();
			}
		}
	}
	
	public void receiveMessage(Message message){
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof Soviet && s != this){
				message.pass(this, s);	

			}
		}
	}
}
