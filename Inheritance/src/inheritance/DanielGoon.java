package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class DanielGoon extends ClubMember implements Soviet{
	private ArrayList<Hacker> fourChan;
	private ArrayList<NetworkAdministrator> nwdm;
	private ArrayList<Student> comrades;
	private boolean uh;
	private int idx;
	
	public DanielGoon(){
		super("Daniel","Goon",2017,Main.COMP_SCI_MAJOR,"minecraft");
		uh = false;
		comrades = new ArrayList<Student>();
	}
	public void act(){
//		System.out.println(getFirstName() +" "+ getLastName());
//		for(Student s: Main.getAllStudents()){
//			if(s instanceof ClubMember && ((ClubMember) s).getClub().equals(getClub()) 
//					&& s != this){
//				shakeHandsWith(s);
//			}
//		}
		for(Student s: Main.getAllStudents()){
			if(s instanceof Hacker){
				fourChan.add((Hacker)s);
			}
		}
	}
	public void run(){
		for(Student s: Main.getAllStudents()){
			if(s instanceof Hacker){
				s.mutate();
			}
		}
	}
	public void recieveMessage(Message message){
		idx = Main.getAllStudents().indexOf(this);
		comrades = Main.getAllStudents();
		for(Student s: Main.getAllStudents()){
			if(s instanceof Soviet){
				comrades.add(s);
			}
		}
		
		if(idx + 1 < comrades.size()){
			message.pass(this, comrades.get(idx + 1));
		}
		else{
			message.pass(this, comrades.get(0));
		}
		
	}
}
