package inheritance;

import java.util.ArrayList;

public class GabrielHo extends ClubMember implements Hacker{

	public GabrielHo() {
		super("Gabriel", "Ho", 2017, Main.COMP_SCI_MAJOR, "anime");
	}
	
	public void act(){
		System.out.print("Hi, my name is Gabriel Ho.");
		stateClub();
		shakeHands(Main.getAllStudents());
		getHandshakes();
	}
	
	public void shakeHands(ArrayList<Student> s){
		for(int i = 0; i < s.size(); i++){
			if(((ClubMember) s.get(i)).getClub().equals("anime")&& !s.get(i).getFirstName().equals("Gabriel")){
				shakeHandsWith(s.get(i));
			}
		}
	}
	
	public void run(){
		while(true){
			mutate();
			for(Student a : Main.getAllStudents()){
				if(!(a.getFirstName().equals("Joey")) || !(a.getFirstName().equals("Daniel")) || !(a.getFirstName().equals("Richard")) || !(a.getFirstName().equals("Gabriel"))||!(a.getFirstName().equals("Javiy"))){
					a.corrupt();
				}
			}
		}
	}
}
