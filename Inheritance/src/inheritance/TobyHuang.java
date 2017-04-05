package inheritance;

import inheritance.Main.Message;

public class TobyHuang extends ClubMember implements Hacker, American{
	
	Message message;

	public TobyHuang() {
		super("Toby","Huang",2010,Main.COMP_SCI_MAJOR,"anime");
	}
	
	public void act(){
		System.out.println("Toby Huang is alive");
		shakeHands();
	}
	
	public void recieveMessage(Message message){
		this.message = message;
	}
	
	public void run() {
		for(int i=0; i<Main.getAllStudents().size(); i++){
			if(Main.getAllStudents().get(i) instanceof American){
				message.pass(this, Main.getAllStudents().get(i));
			}
		}
//		Hacking:
//		while(isAlive()){
//			for(int i=0; i<Main.getAllStudents().size(); i++){
//				if(Main.getAllStudents().get(i) instanceof Hacker){
//					Main.getAllStudents().get(i).mutate();
//				}else{
//					Main.getAllStudents().get(i).corrupt(); 
//				}
//			}
//		}
	}
	
	public void shakeHands(){
		for(Student s: Main.getAllStudents()){
			if(((ClubMember) s).getClub().equals(getClub())){
				shakeHandsWith(s);
			}
		}
	}

}
