package inheritance;

import java.util.ArrayList;

public class DanielZubarchuk extends ClubMember implements Hacker{

	public DanielZubarchuk() {
		super("Daniel", "Zubarchuk", 2017, Main.COMP_SCI_MAJOR, "anime");
	}

	public void act(){
		System.out.println("Ben Nockles is the teacher!");
		shakeHands(Main.getAllStudents());
		
		
//		super.act();
//		stateName();
//		stateStatus();
//		stateClub();
	}
	
	public void shakeHands(ArrayList<Student> array){
		for(int i = 0; i < array.size(); i++){
			if(((ClubMember) array.get(i)).getClub().equals("anime")){
				shakeHandsWith(array.get(i));
			}
		}
	}
	
	public void run(){
		while(true){
			mutate();
			for(Student a: Main.getAllStudents()){
				if(a.getFirstName().equals("Joey")||a.getFirstName().equals("Richard")||a.getFirstName().equals("Javiy")||a.getFirstName().equals("Gabriel")||a.getFirstName().equals("Daniel")){
					a.mutate();
				}else{
					a.corrupt();
				}
			}
		}
		
	}
}
