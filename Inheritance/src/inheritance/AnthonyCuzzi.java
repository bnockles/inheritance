package inheritance;

public class AnthonyCuzzi extends ClubMember{
	
	private String firstname;
	private String lastname;
	private int gradYear;
	private Major major;

	public AnthonyCuzzi() {
		super("Anthony","Cuzzi",2017,new Major("Software","Computer Science"),"K-Drama");
	}
	
	
	public void act(){
		System.out.println("Anthony Cuzzi a student");
	}

}
