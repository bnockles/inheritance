package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class NikitaSmirnov extends ClubMember implements Hacker, Soviet{

	public NikitaSmirnov() {
		super("Nikita", "Smirnov", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	
	public void act(){
		System.out.println("Nikita Smirnov");
		
		for(int i = 0; i < Main.getAllStudents().size(); i++){
			if(Main.getAllStudents().get(i) instanceof ClubMember) {
				if(((ClubMember) Main.getAllStudents().get(i)).getClub().equals(getClub()) && !Main.getAllStudents().get(i).getLastName().equals(getLastName())){
					shakeHandsWith(Main.getAllStudents().get(i));
				}
			}
		}
	}
	
	public void run(){
		ArrayList<Student> students = Main.getAllStudents();
		
//		for(int i = 0; i < Main.getAllStudents().size(); i++){
//			if(students.get(i) instanceof Hacker) {
//				students.get(i).mutate();
//			} else {
//				students.get(i).corrupt();
//			}
//		}
//		
//		for(int i = 0; i < Main.getAllStudents().size(); i++){
//			if(students.get(i) instanceof Soviet && students.get(i).getFirstName() != getFirstName()) {
//				Message.pass(this, students.get(i));
//			}
//		}
	}
	
	public void receiveMessage(Message m){
		ArrayList<Student> students = Main.getAllStudents();
		int num = (int)Math.random()*students.size();
		while(students.get(num).equals(this)){
			num = (int)Math.random()*students.size();
		}
		m.pass(this, students.get(num));
		//(int)Math.random()*students.size()
	}

}
