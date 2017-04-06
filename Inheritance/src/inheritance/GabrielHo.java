package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class GabrielHo extends ClubMember implements Soviet{

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
		
	}
	
	public void recieveMessage(Message message){
		for(Student i: Main.getAllStudents()){
			if(i.getFirstName().equals("Joseph")){
				message.pass(this,i);
				break;
			}
		}
	}
	
}
