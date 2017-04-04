package inheritance;

public class EduardoRouse extends ClubMember {

	public EduardoRouse() {
		super("Eduardo", "Rouse", 2017, Main.COMP_SCI_MAJOR, "esports");
	}
	
	public void act(){
		System.out.print("My name is"+getFirstName()+" "+getLastName()+". What are you?");
	}

}
