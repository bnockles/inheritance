package inheritance;

public class AliEldeeb extends ClubMember implements Hacker {
	private String firstName;
	private String lastName;

	public AliEldeeb() {
		super("Ali", "Eldeeb", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	public void act(){
		System.out.println("Ali Eldeeb");
		for(Student a: Main.getAllStudents()){
			if(((ClubMember) a).getClub().equals(getClub()) && a.getFirstName()!=getFirstName()){
				shakeHandsWith(a);
			}
		}
	}
	public void run(){
		while(true){
			mutate();
		}
	}

}
