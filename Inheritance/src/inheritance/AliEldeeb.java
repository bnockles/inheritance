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
		ArrayList<Student> soviets = new ArrayList<Student>();
		for(Student s: Main.getAllStudents()){
			if(s instanceof Soviet){
				soviets.add(s);
			}
		}
		int index = soviets.indexOf(this);
		if(index + 1 <soviets.size()){
			message.pass(this, soviets.get(index + 1));
		}else{
			message.pass(this, soviets.get(0));
		}
	}
}
