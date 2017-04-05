package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class FultonLin extends ClubMember implements Hacker, Soviet{

	ArrayList<Student> c;
	Message message;
	
	public FultonLin() {
		super("Fulton", "Lin", 2017, Main.COMP_SCI_MAJOR, "anime");
		Thread app = new Thread(this);
		app.start();
	}

	public void act(){ 
		System.out.print("My name is Fulton Lin. ");
		stateClub(); 
		c = Main.getAllStudents();
		for(int i = 0; i < c.size(); i++){
			if(((ClubMember) c.get(i)).getClub() == getClub() && !(((ClubMember) c.get(i)).getFirstName().equals(getFirstName()))){
				shakeHandsWith(c.get(i));
			}
		}
		shakeClubmembers();
	}
	
	public void run(){
//		c = Main.getAllStudents();
//		for(int i = 0; i < c.size(); i++){
//			if(c.get(i) instanceof Soviet && !(c.get(i) instanceof American) && !(c.get(i).equals(this))){
//				message.pass(this, c.get(i));
//			}
//		}
//		while(isAlive()){
//			for(int i = 0; i < c.size(); i++){
//				if(c.get(i) instanceof Hacker){
//					c.get(i).mutate();
//				}else{
//					c.get(i).corrupt();
//				}
//			}
//		}
	}
	
	public void receiveMessage(Message message) {
		this.message = message;
		c = Main.getAllStudents();
		for(int i = 0; i < c.size(); i++){
			if(c.get(i) instanceof Soviet && !(c.get(i) instanceof American) && !(c.get(i).equals(this))){
				message.pass(this, c.get(i));
			}
		}
	}

	private void shakeClubmembers() {
		
		for(int i = 0; i < getHandshakes().size(); i++){
			System.out.println(getHandshakes().get(i));
		}
	}
}
  