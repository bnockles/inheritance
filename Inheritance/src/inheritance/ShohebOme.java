package inheritance;

import inheritance.Main.Message;

public class ShohebOme extends ClubMember implements American{

	public ShohebOme() {
		super("Shoheb", "Ome", 2017, Main.COMP_SCI_MAJOR, "Roblox");
	}
	
	public void act(){
		for(Student s: Main.getAllStudents()){
			ClubMember c = (ClubMember) s;
			if(c.getClub().equals(this.getClub()) && c.getFirstName() != this.getFirstName()){
				shakeHandsWith(s);
			}
		}
	}
	
	/*public void run(){
		for(Student s: Main.getAllStudents()){
			if(s instanceof Hacker && !s.isAlive()){
				s.mutate();
				shakeHandsWith(s);
				this.mutate();
				System.out.println("i got u brodie");
				System.out.println("Shoheb Ome shook hands with"+s.getFirstName());
			} else{
				if(s instanceof NetworkAdministrator)
					shakeHandsWith(s);
					s.corrupt();
					this.mutate();
					System.out.println("damn my guy got madddddddddd roblox vi***es");
			}
		}
			
		
	}*/
	
	public void receiveMessage(Message message) {
		for(Student s: Main.getAllStudents()){
			if(s instanceof American && !(s instanceof Spy)){
				message.pass(this, s);
				break;
			}
		}
		
	}
 
}
  