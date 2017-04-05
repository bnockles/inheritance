package inheritance;

public class ShohebOme extends ClubMember implements Hacker{

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
	
	public void run(){
		for(Student s: Main.getAllStudents()){
			if(s instanceof Hacker && !s.isAlive()){
				s.mutate();
				shakeHandsWith(s);
				this.mutate();
				System.out.println("i got u brodie");
			} else{
				if(s instanceof NetworkAdministrator)
					shakeHandsWith(s);
					s.corrupt();
					this.mutate();
					System.out.println("damn my guy got madddddddddd roblox vi***es");
			}
		}
			
		
	}
 
}
  