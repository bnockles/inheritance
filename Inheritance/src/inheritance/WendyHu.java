package inheritance;

public class WendyHu extends ClubMember {

	public WendyHu() {
		// TODO Auto-generated constructor stub
		super("Wendy","Hu",2021,Main.COMP_SCI_MAJOR, "anime");
	}
	
	@Override 
	public void act(){
		System.out.println("My name is Wendy Hu");
	}

}
  