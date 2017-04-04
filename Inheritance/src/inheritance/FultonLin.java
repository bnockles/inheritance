package inheritance;

import java.util.ArrayList;

public class FultonLin extends ClubMember implements Hacker{

	ArrayList<Student> c;
	
	public FultonLin() {
		super("Fulton", "Lin", 2017, Main.COMP_SCI_MAJOR, "anime");
		Thread app = new Thread(this);
		app.start();
		while(true){
			for(int i = 0; i < c.size(); i++){
				if((((ClubMember) c.get(i)).getFirstName().equals(getFirstName()))){
					c.get(i).mutate();
				}
			}
		}
	}

	public void act(){ 
		System.out.print("My name is Fulton Lin. ");
		stateClub();
		c = Main.getAllStudents();
		for(int i = 0; i < c.size(); i++){
			if(((ClubMember) c.get(i)).getClub() == getClub() && !(((ClubMember) c.get(i)).getFirstName().equals(getFirstName()))){
				shakeHandsWith(c.get(i));
			}
		}
		shakeClubmembers();
	}
	
	public void run(){
		c = Main.getAllStudents();
		while(isAlive()){
			for(int i = 0; i < c.size(); i++){
				if(c.get(i) instanceof Hacker){
					c.get(i).mutate();
				}else{
					c.get(i).corrupt();
				}
			}
		}
	}

	private void shakeClubmembers() {
		for(int i = 0; i < getHandshakes().size(); i++){
			System.out.println(getHandshakes().get(i));
		}
	}
}
  