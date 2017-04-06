package inheritance;

import inheritance.Main.Message;

public class IvanZhen extends ClubMember implements NetworkAdministrator,American {

	public IvanZhen() {
		
		super("Seto(Ivan)" ,"Kaiba(Zhen)", 2017, Main.COMP_SCI_MAJOR,"tcg");
		
	}
	@Override
	public void receiveMessage(Message message){
		for(Student s: Main.getAllStudents()){
			if(s.getFirstName().equals("Simon")){	
				System.out.println("Hi neighbor.");
				message.pass(this, s);
				break;
			}
			else if(s instanceof Soviet){
				System.out.println("What's popping neighbor? Oh, you're not an American," + s.getFirstName());
			}
	}
	}
	

	@Override
	public void act(){
		for(Student s: Main.getAllStudents()){
			ClubMember c = (ClubMember) s;
			if(c.getClub().equals(this.getClub()) && c.getFirstName() != this.getFirstName()){
				shakeHandsWith(s);
			}
		}
	}
		//s
	
	public void run(){
		while(true){
			for( Student s:Main.getAllStudents()){
				if(s instanceof NetworkAdministrator && !s.isAlive()){
					s.restore();
				}
				else if(s instanceof Hacker){
					s.createPatch();
				}
			}
		}
	}
	
	
}