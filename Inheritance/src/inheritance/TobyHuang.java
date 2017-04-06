package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class TobyHuang extends ClubMember implements Hacker, American{
	
	Message message;

	public TobyHuang() {
		super("Toby","Huang",2010,Main.COMP_SCI_MAJOR,"anime");
	}
	
	public void act(){
		System.out.println("Toby Huang is alive");
		shakeHands();
	}
	
	public void recieveMessage(Message message){
		this.message = message;
	}
	
	public void run() {
		ArrayList<Student> s = Main.getAllStudents();
		for(int i=0; i<s.size(); i++){
			Student m = s.get(i);
			if(m.getFirstName() == "Jenniber"){
				message.pass(this, m);
				break;
			}
		}
//		Hacking:
//		while(isAlive()){
//			for(int i=0; i<Main.getAllStudents().size(); i++){
//				if(Main.getAllStudents().get(i) instanceof Hacker){
//					Main.getAllStudents().get(i).mutate();
//				}else{
//					Main.getAllStudents().get(i).corrupt(); 
//				}
//			}
//		}
	}
	
	public void shakeHands(){
		for(Student s: Main.getAllStudents()){
			if(((ClubMember) s).getClub().equals(getClub())){
				shakeHandsWith(s);
			}
		}
	}

}
