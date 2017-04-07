package inheritance;

import java.util.ArrayList;

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
		ArrayList<Student> players = Main.getAllStudents();
		for(int i=0;i<players.size();i++){
			if(players.get(i).getFirstName().equals("Hans")){
				message.pass(this, players.get(i));
				break;
			} 
		}
		/*for(Student s: Main.getAllStudents()){
			if(s instanceof American && !(s instanceof Spy) && !(s.getFirstName().equals(this.getFirstName()))){
				message.pass(this, s);
				
				break;
			}
		}
		int index = 0;
		Student currentStudent = this;
		while(index < Main.getAllStudents().size()){
			for(int i = index; i < Main.getAllStudents().size(); i++){
				if(Main.getAllStudents().get(i) instanceof American &&
						!(Main.getAllStudents().get(i) instanceof Spy) && 
						!(Main.getAllStudents().get(i).getFirstName().equals(this.getFirstName()))){
					message.pass(currentStudent, Main.getAllStudents().get(i));
					currentStudent = Main.getAllStudents().get(i);
					index = i+1; 
					break; 
				}
			}
		}*/
		
	}
 
}
  