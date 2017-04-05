package inheritance;

public class JiayanChen extends ClubMember {

	
	public JiayanChen() {
		super("Jiayan", "Chen", 2017, Main.COMP_SCI_MAJOR, "pokemon");
		// TODO Auto-generated constructor stub
	}

	public void act()
	{
		stateName();
		stateClub();
		System.out.println("hiiii");
		for(Student s : Main.getAllStudents()){
			ClubMember member = (ClubMember) s;
			if(member.getClub().equals(this.getClub()) )
				shakeHandsWith(s);
		}
	}  

}
  