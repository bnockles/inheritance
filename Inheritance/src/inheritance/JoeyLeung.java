package inheritance;

import inheritance.Main.Message;

public class JoeyLeung extends ClubMember implements Spy{

	public JoeyLeung() {
		// TODO Auto-generated constructor stub
		super("Joey", "Leung", 2017, Main.COMP_SCI_MAJOR, "anime");
	}

	
	@Override
	public void act(){
		System.out.print(getFirstName() + " "+getLastName());
		for(Student a: Main.getAllStudents()){
			if(((ClubMember) a).getClub().equals(getClub()) && a.getFirstName()!=getFirstName()){
				shakeHandsWith(a);
			}
		}
//		for(Student b: getHandshakes()){
//			System.out.print(b.getFirstName());
//		}
	}
	
	//instanceof is for checking interface
	
	public void run(){
	}
	
//	spy
	public void receiveMessage(Message message){
		message.pass((Student)this,Main.getAllStudents().get((int) (Math.random()*Main.getAllStudents().size())));
	}
	
//	Soviet
//	public void receiveMessage(Message message){
//	for(Student s:Main.getAllStudents()){
//		if(s.instanceof American
//		message.pass((Student)this,
//	}
	
}
