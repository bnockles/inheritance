package inheritance;

public class DanielGoon extends ClubMember{
	public DanielGoon(){
		super("Daniel","Goon",2017,Main.COMP_SCI_MAJOR,"minecraft");
	}
	public void act(){
		System.out.println(getFirstName() + getLastName());
	}
	
}
