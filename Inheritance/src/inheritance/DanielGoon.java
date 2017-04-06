package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class DanielGoon extends ClubMember implements Soviet{
	private ArrayList<Hacker> fourChan;
	private ArrayList<NetworkAdministrator> nwdm;
	public DanielGoon(){
		super("Daniel","Goon",2017,Main.COMP_SCI_MAJOR,"minecraft");
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
		ArrayList<Student> stu = Main.getAllStudents();
 		for(Student s: stu){
			if(this != s && s instanceof Soviet){
				message.pass(this, s);
				break;
			}
		}
	}
}
