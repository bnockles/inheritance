package inheritance;

public class IvanZhen extends ClubMember implements NetworkAdministrator {

	public IvanZhen() {
		
		super("Seto(Ivan)" ,"Kaiba(Zhen)", 2017, Main.COMP_SCI_MAJOR,"tcg");
		
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