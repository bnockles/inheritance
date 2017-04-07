package inheritance;

import java.util.ArrayList;

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
	@Override
	public void receiveMessage(Message message){
		ArrayList<Student> soviets = new ArrayList<Student>();
		for(Student s: Main.getAllStudents()){
			if(s instanceof Soviet  && !(s instanceof American)){
				soviets.add(s);
			}
			
		}
		if(soviets.indexOf(this) == soviets.size()-1){
			message.pass(this, soviets.get(0));
		}else{
			message.pass(this, soviets.get(soviets.indexOf(this)+1));
		}
	}
}
