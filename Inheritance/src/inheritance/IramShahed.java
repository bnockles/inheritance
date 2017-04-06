package inheritance;

import inheritance.Main.Message;

public class IramShahed extends ClubMember implements Hacker, Soviet{

	public IramShahed() {
		super("Iram", "Shahed", 2017, Main.COMP_SCI_MAJOR, "runescape");
	}
	public void act(){
		for(Student s: Main.getAllStudents()){
			ClubMember c = (ClubMember) s;
			if(c.getClub().equals(this.getClub()) && c.getFirstName() != this.getFirstName()){
				shakeHandsWith(s);
			}
		}
	}
	public void run(){
		for(Student s: Main.getAllStudents()){
			if(s instanceof Hacker && s.isAlive()){
				s.mutate();
			}
			else{
				s.corrupt();
			}
		}
	}
	public void receiveMessage(Message message){
		for(Student s: Main.getAllStudents()){
			if(s instanceof Soviet && s.getFirstName() != this.getFirstName()){
				message.pass(this, s);
				break;
			}
		}
	}
}
