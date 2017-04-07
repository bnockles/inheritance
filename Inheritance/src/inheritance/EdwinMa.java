package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class EdwinMa extends ClubMember implements Hacker, Coder{

	public EdwinMa() {
		super("Edwin","Ma",2017,Main.COMP_SCI_MAJOR,"runescape");
		// TODO Auto-generated constructor stub
	}
	public void act(){
		System.out.println("It's a level 69 wild Edwin!");
		for(Student s: Main.getAllStudents()){
			ClubMember c = (ClubMember)s;
			if(c!= this && c.getClub().equals(getClub())){
				System.out.println("I shook hands with "+c.getFirstName()+" "+c.getLastName()+"!");
				shakeHandsWith(c);
			}
		}
	}
	
	public void receiveMessage(Message message){
//		Message fake = new Message(5, 5, 5, 5);
		for(Student s: Main.getAllStudents()){
//			if(s instanceof Soviet){
//				
//			}
			if(s.getFirstName().equals("Hans")){
				message.pass(this, s);
				break;
			}
			
		}
	}
	
	public void run(){
//		ArrayList<Student> s = Main.getAllStudents();
//		while(true){
//			if(!isAlive()){
//				this.mutate();
//			}
//			for(Student k : s){
//				if(k instanceof NetworkAdministrator){
//					k.corrupt();
//				}
//				else{
//					k.mutate();
//				}
//			}
//		}
		
		
		
		
		
		
		
	}
}
