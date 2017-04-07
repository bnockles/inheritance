package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class AlexHuang extends ClubMember implements American{

	public AlexHuang() {
		super("Alex","Huang",2017,Main.COMP_SCI_MAJOR,"runescape");
	}
	public void act(){
		System.out.println("Alex Huang");
//		for(Student i: Main.getAllStudents()){
//			if (((ClubMember) i).getClub().equals("runescape")){
//				if(i!= this && ((ClubMember)i).getClub().equals(getClub())){
//				shakeHandsWith(i);
//				
//				}
//			}
			
//		}
	}
//	public void run(){
//		ArrayList<Student> s = Main.getAllStudents();
//		while(true){
//			for(int i = 0; i < s.size();i++){
//				if(s.get(i) instanceof NetworkAdministrator){
//					s.get(i).corrupt();
//				}
//				else if(s.get(i) instanceof Hacker){
//					s.get(i).mutate();
//					//
//				}
//			}
//		}
//	}
		public void receiveMessage(Message message) {
		
		ArrayList<Student> s = Main.getAllStudents();
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).getFirstName().equals("Hans")) {
				message.pass(this, s.get(i));
			}
			break;
			//
		}
		
	}
}
