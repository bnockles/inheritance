package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class EdwinMa extends ClubMember implements Hacker, American{

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
		Student k = new BillyLuy();
		message.pass(this, Main.getAllStudents().get(Main.getAllStudents().indexOf(k)));
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
