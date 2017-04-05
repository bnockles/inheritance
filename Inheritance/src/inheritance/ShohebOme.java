package inheritance;

public class ShohebOme extends ClubMember {

	public ShohebOme() {
		super("Shoheb", "Ome", 2017, Main.COMP_SCI_MAJOR, "Roblox");
	}
	
	public void act(){
		for(Student s: Main.getAllStudents()){
			ClubMember c = (ClubMember) s;
			if(c.getClub() == this.getClub()){
				shakeHandsWith(s);
			}
		}
	}

}
  