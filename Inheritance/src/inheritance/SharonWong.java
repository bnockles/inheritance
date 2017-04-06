package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class SharonWong extends ClubMember implements Soviet{

	private ArrayList<Student> students = Main.getAllStudents();
	
	public SharonWong() {
		super("Sharon", "Wong", 2017, Main.COMP_SCI_MAJOR,"pokemon");
	}
	
	public void act(){
		//super.act();
		//System.out.println(" Share on .");
		students=Main.getAllStudents(); 
		for(Student s: students){
			if(s instanceof ClubMember && ((ClubMember)s).getClub()=="pokemon"&& !(s.getFirstName().equals(getFirstName()))){
				shakeHandsWith(s);
				System.out.println("shook hands with"+s);
			}
		}
	}
	
	public void run(){
//		while(isAlive()){
//		for(Student s: students){
//			if(s instanceof Hacker){
//				s.createPatch();
//			}else{
//				s.restore();
//			}
//		}
//		}//
		
	}//end of run
	public void receiveMessage(Message message){
		for(Student s: students){
			if (s instanceof Soviet){
			message.pass(s, this);
			}
		}
	}

}
