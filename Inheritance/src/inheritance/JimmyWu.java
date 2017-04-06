package inheritance;

import inheritance.Main.Message;

public class JimmyWu extends ClubMember implements   NetworkAdministrator,Soviet{

	public JimmyWu() {
		super("Jimmy", "Wu", 2017, Main.COMP_SCI_MAJOR, "k-pop");

	}
	
	
	@Override
	public void act(){ 
		System.out.println("My name is Jimmy");
		
		for(int i = 0; i < Main.getAllStudents().size(); i++){
			Student s = Main.getAllStudents().get(i);
			if( s instanceof ClubMember && ((ClubMember) s).getClub().equals(this.getClub()) && !s.equals(this)){
				shakeHandsWith(s);
			}
		}
	} 
	
	@Override
	public void run(){
		while(true){
			for(Student s: Main.getAllStudents()){
				if(s instanceof NetworkAdministrator && !s.isAlive()){
					s.restore();
				}
				else if(s instanceof Hacker && s.isAlive()){
					s.createPatch();
				}
			}
		}
	}
	
	@Override
	public void receiveMessage(Message message){
		for(Student s: Main.getAllStudents()){
			if(s instanceof Soviet  && !(s instanceof American)){
				System.out.println("rush b cyka blyat");
				message.pass(this, s);
				break;
			}
		}
	}
}
