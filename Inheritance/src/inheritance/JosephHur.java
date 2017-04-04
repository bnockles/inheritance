package inheritance;

public class JosephHur extends ClubMember {
	
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
}
  