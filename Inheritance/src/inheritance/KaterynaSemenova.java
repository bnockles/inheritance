package inheritance;

public class KaterynaSemenova extends ClubMember {

	public KaterynaSemenova(){
		super("Kat","Semenova", 2012, Main.COMP_SCI_MAJOR, "music");
	}
	
	public void act(){
		System.out.println("Hi, I'm " + this.getFirstName()+" "+this.getLastName());
	}
}
