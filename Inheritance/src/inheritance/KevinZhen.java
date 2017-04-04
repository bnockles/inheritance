package inheritance;

import java.util.ArrayList;

public class KevinZhen extends ClubMember
{
	public KevinZhen() 
	{
		super("Kevin", "Zhen", 2017, Main.COMP_SCI_MAJOR, "esports");
	}
	
	@Override
	public void act()
	{
		
		System.out.println("I'm Kevin Zhen... I'm in the esport club.");
		addFriends(Main.getAllStudents());
		System.out.println(getHandshakes());
	}

	private void addFriends(ArrayList<Student> s) 
	{
		for (int i = 0; i < s.size();i++)
		{
			if(((ClubMember) s.get(i)).getClub().equals("esports") && !s.get(i).getFirstName().equals("Kevin"))
			{
				shakeHandsWith(s.get(i));
			}
		}
		
	}
}
