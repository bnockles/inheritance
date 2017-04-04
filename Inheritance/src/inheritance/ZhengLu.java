package inheritance;

public class ZhengLu extends ClubMember {
	
	private String food;
	
	public ZhengLu() {
		super("Zheng", "Lu", 2017, Main.COMP_SCI_MAJOR, "anime");
		food = "potatoes";
	}
	
	public void act()
	{
		System.out.print("\nMy name is "+getFirstName()+" "+getLastName()+". ");
		stateFood();
		shakeHands();
	}
	
	public void stateFood() {
		System.out.print("I like " + food + ".");
	}
	
	public void shakeHands()
	{
		for(Student s : Main.getAllStudents())
			if(s instanceof ClubMember && ((ClubMember) s).getClub().equals(getClub()) && !s.equals(this))
				shakeHandsWith(s);
	}

}
