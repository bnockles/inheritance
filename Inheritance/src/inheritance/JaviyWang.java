package inheritance;

import java.util.ArrayList;

public class JaviyWang extends ClubMember implements Hacker{

	public JaviyWang() {
		super("Javiy", "Wang", 2017, Main.COMP_SCI_MAJOR,"anime");
	}

	public void act(){
		System.out.println("Javiy Wang, this is all I have to say");
		addFriendsInTheSameClub(Main.getAllStudents());
		System.out.println(getHandshakes());
	}
	
	private void addFriendsInTheSameClub(ArrayList<Student> s){
		for(int i = 0;i < s.size();i++){
			if(((ClubMember) s.get(i)).getClub().equals("anime")&& !s.get(i).getFirstName().equals("Javiy")){
				shakeHandsWith(s.get(i));
			}
		}
	}
}
