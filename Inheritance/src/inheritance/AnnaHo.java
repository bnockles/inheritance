package inheritance;

public class AnnaHo extends ClubMember{
	
	public AnnaHo() {
		super("Anna", "Ho", 2017, Main.COMP_SCI_MAJOR, "batman");
 
	} 
	
	public void act(){
		//super.act();
		System.out.println("Anna Ho");
	}
}
