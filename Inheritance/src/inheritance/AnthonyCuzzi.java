package inheritance;

import inheritance.Main.Message;

public class AnthonyCuzzi extends ClubMember implements NetworkAdministrator, American{
	
	public AnthonyCuzzi() {
		super("Anthony","Cuzzi",2017,new Major("Software","Computer Science"),"anime");
	}
	
	
	public void recieveMessage(Message message){
		boolean sent = true;
		while(sent){
			int randInt = (int) (Math.random()*Main.getAllStudents().size());
			Student s = Main.getAllStudents().get(randInt);
			if(s instanceof American && !(s instanceof Soviet)){
				message.pass(this,s);
				sent = false;
			}
		}
	}
	
	public void run(){
	}

}
