package inheritance;

import inheritance.Main.Message;

public class AnthonyCuzzi extends ClubMember implements NetworkAdministrator, American{
	
	public AnthonyCuzzi() {
		super("Anthony","Cuzzi",2017,new Major("Software","Computer Science"),"anime");
	}
	
	
	public void recieveMessage(Message message){
		for(Student s: Main.getAllStudents()){
			if(s.getFirstName().equals("Kateryna")){
				message.pass(this,s);
			}
		}
	}
	
	public void run(){
	}

}
