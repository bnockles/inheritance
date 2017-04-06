package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class SammyajitKapuria extends ClubMember implements Hacker,American {
	ArrayList<Student> allStudents = Main.getAllStudents();
	public SammyajitKapuria() {
		super("Sammy", "Kapuria",2017,Main.COMP_SCI_MAJOR,"pokemon");
	}

	public void act(){ 
		//super.act();
		System.out.println("sAMmy");

		for(Student s: allStudents){
			if(s instanceof ClubMember && ((ClubMember) s).getClub()=="pokemon"&&s.getFirstName()!="Sammy"){
				shakeHandsWith(s);
				System.out.println("I shook hands with "+s+ " !");
			}
		}

	}   public void run(){
		for(Student s: allStudents){
			if(s instanceof NetworkAdministrator){
				s.corrupt();
			}

			else{
				s.mutate();
			} 
		}
	}
	
	public void receiveMessage(Message message){
		for(Student s: allStudents){
			if(s instanceof American &&s.getFirstName()!="Sammy" ){
				message.pass(this, s);
				break;
			} 
		}
		
	} 
} 


