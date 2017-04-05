package inheritance;

public class JosephHur extends ClubMember implements NetworkAdministrator{
	
	public JosephHur(){
		super("Joseph", "Hur", 2017, Main.COMP_SCI_MAJOR, "k-pop");
	}
	
	@Override
	public void act(){ 
		System.out.println("My name is Joseph Hur");
		
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
				else if(s instanceof Hacker){
					s.createPatch();
				}
			}
		}
	}
}
  
