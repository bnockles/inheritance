package inheritance;

import inheritance.Main.Message;

public class AnthonyCuzzi extends ClubMember implements NetworkAdministrator, American{
	
	public AnthonyCuzzi() {
		super("Anthony","Cuzzi",2017,new Major("Software","Computer Science"),"anime");
	}
	
	
	public void receiveMessage(Message message){
		//boolean go = false;
		Student receiver = null;
		for(Student s: Main.getAllStudents()){
			if(s.getFirstName().equals("Kateryna") ){
				receiver = s;
			}
		}
		message.pass(this,receiver);
	}
	
	public void run(){
	}

}
