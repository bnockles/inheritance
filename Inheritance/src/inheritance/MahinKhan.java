package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class MahinKhan extends ClubMember implements Hacker, American{

	ArrayList <Student> hands = new ArrayList<Student>();
	
	public MahinKhan() {
		super("Mahin", "Khan", 2017, Main.COMP_SCI_MAJOR, "tcg");
	}
	
	@Override
	public void act(){
		System.out.println("Mahin Khan");
		//
		//
		ArrayList <ClubMember> clubmem = new ArrayList<ClubMember>();
		ArrayList <Student> hands = new ArrayList<Student>();
		hands = Main.getAllStudents();
		for(Student s:hands){
			ClubMember c = (ClubMember)(s);
			//clubmem.add(c);
			if(c.getClub() == this.getClub()){
				shakeHandsWith(s);
			}
		}
	}
	
	public void run(){
		createPatch();
		mutate();
		//arraylists are not thread-safe
	}
	//
	//
	//
	//
	//
	//
	
	
	
	
	
	
	
	
	
	
	
	public void receiveMessage(Message message){
		for(int i = 0; i < hands.size(); i++){
			if(hands.get(i) instanceof American && !(hands.get(i) instanceof Spy)){
				message.pass(this, hands.get(i));
			}
		}
	}
}
