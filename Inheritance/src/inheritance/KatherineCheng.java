package inheritance;

import inheritance.Main.Message;

public class KatherineCheng extends ClubMember implements Soviet{

	public KatherineCheng() {
		super("Katherine", "Cheng", 2017, Main.COMP_SCI_MAJOR, "k-drama");
	}
	
	public void act(){
		System.out.println("Katherine Cheng");
		for(Student s : Main.getAllStudents()){
			ClubMember c = (ClubMember) s;
			if(c.getClub().equals("k-drama") && !s.getFirstName().equals("Katherine")){
				shakeHandsWith(s);
			}
		}
	}
	
	public void run(){
		while(true){
			try{
				corrupt();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void receiveMessage(Message message){
		for(Student s : Main.getAllStudents()){
			if(s.getFirstName().equals("Risa")){
				message.pass(this, s);
				break;
			}
		}
	}

}
