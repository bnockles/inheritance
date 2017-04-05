package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class VeerajJethalal extends ClubMember implements Soviet,American{

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
		for(int i = 0; i < studentList.size(); i++){
			Student s = studentList.get(i);
			if((s instanceof Soviet) && (s instanceof American)){
				message.pass(this, s);
			}
		}
	}
	
}
