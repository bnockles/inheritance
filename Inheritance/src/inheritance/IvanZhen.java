package inheritance;

public class IvanZhen extends ClubMember implements NetworkAdministrator {

	public IvanZhen() {
		
		super("Seto(Ivan)" ,"Kaiba(Zhen)", 2017, Main.COMP_SCI_MAJOR,"tcg");
		
	}


	@Override
	public void act(){
		System.out.println("Ivan Zhen is the duelist!");
		for(int i = 0; i < Main.getAllStudents().size(); i++){
			Student s = Main.getAllStudents().get(i);
			if( s instanceof ClubMember && ((ClubMember) s).getClub().equals(this.getClub()) && !s.equals(this)){
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