package inheritance;

public class JosephHur extends ClubMember {
	
	public JosephHur(){
		super("Joseph", "Hur", 2017, Main.COMP_SCI_MAJOR, "k-pop");
	}
	
	@Override
	public void act(){ 
		stateName();
	}
}
 