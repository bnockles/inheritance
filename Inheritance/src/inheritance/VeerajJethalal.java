package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class VeerajJethalal extends ClubMember implements Soviet{

	public VeerajJethalal() {
		super("Veeraj", "Jethalal", 2017, Main.COMP_SCI_MAJOR, 
				"music");
	}
	
	@Override
	public void act(){
		stateName();
	}
	
	public void receiveMessage(Message message){
		ArrayList<Student> studentList = Main.getAllStudents();
		for(Student s: studentList){
			if(s.getFirstName().equals("Katherine") &&
					s.getLastName().equals("Cheng")){
				message.pass(this, s);				
			}
			break;	
		}
	}
	
}
