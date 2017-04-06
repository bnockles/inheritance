package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class AliEldeeb extends ClubMember implements Hacker, Soviet {
	public AliEldeeb() {
		super("Ali", "Eldeeb", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	public void act(){
		System.out.println("Ali Eldeeb");
		for(Student a: Main.getAllStudents()){
			if(((ClubMember) a).getClub().equals(getClub()) && a.getFirstName()!=getFirstName()){
				shakeHandsWith(a);
			}
		}
	}
	public void run(){
		while(true){
			mutate();
		}
	}
	public void receiveMessage(Message message){
		ArrayList<Student> studentList = Main.getAllStudents();
		for(int i = 0; i < studentList.size(); i++){
			Student s = studentList.get(i);
			if(s instanceof Soviet) {
				message.pass(this, s);
				break;//
			}
		}
	}
}
