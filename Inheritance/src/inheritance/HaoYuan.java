package inheritance;

import java.util.ArrayList;

import inheritance.Main;
import inheritance.Main.Message;

public class HaoYuan extends ClubMember implements Hacker, Soviet{
	
	public HaoYuan() {
		super("Hao", "Yuan", 2017, Main.COMP_SCI_MAJOR, "music");
	}
	
	public void act() {
		System.out.println("Hao Yuan");
		for(Student s : Main.getAllStudents()){
			if(s != this && s instanceof ClubMember && ((ClubMember) s).getClub().equals(getClub()))
				shakeHandsWith(s);
		}
	}
	
	public void run() {
		while(true){
//			for(Student s: Main.getAllStudents()) {
//				mutate();
//				if (s instanceof NetworkAdministrator){
//					s.corrupt();
//				}
//				else if (s != this){
//					s.mutate();
//				}
//			}
		}
	}
	
	public void recieveMessage(Message message) {
		for(Student i: Main.getAllStudents()){
			if(i.getFirstName().equals("Joey")){
				message.pass(this,i);
				return;
			}
		}
	}
	
}

