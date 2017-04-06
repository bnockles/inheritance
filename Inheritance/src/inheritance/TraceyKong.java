package inheritance;

import inheritance.Main.Message;

public class TraceyKong extends ClubMember implements Soviet{

	public TraceyKong() {
		super("Tracey", "Kong", 2017, Main.COMP_SCI_MAJOR, "k-drama");
	}
	  
	public void act(){
		System.out.println("My name is Tracey Kong.");
		shakeHands();
		
	}
   
	public void shakeHands(){
		for(Student s: Main.getAllStudents()){
			if(((ClubMember) s).getClub().equals(getClub()) && !(s.equals(this))){
				shakeHandsWith(s);
			}
		}
	}
	 
	public void run(){
//		while(true){
//			for(Student s: Main.getAllStudents()){
//				if(s instanceof Hacker && !(s.equals(this))){
//					s.createPatch();
//				}else if(s instanceof NetworkAdministrator){
//					s.corrupt();
//				}
//			} 
//			
//		} 
	}
	 
	public void receiveMessage(Message message){
		boolean passed = false;
		while(!passed){ 
			Student ally = Main.getAllStudents().get((int) (Math.random()*(Main.getAllStudents().size())));
			if(ally instanceof Soviet && ally instanceof American && !ally.equals(this)){
					message.pass(this, ally);
					passed = true;
			}
		} 
	}
}
