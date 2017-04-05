package inheritance;

import java.util.ArrayList;

public class DanielGoon extends ClubMember implements Hacker{
	private ArrayList<Hacker> fourChan;
	private ArrayList<NetworkAdministrator> nwdm;
	public DanielGoon(){
		super("Daniel","Goon",2017,Main.COMP_SCI_MAJOR,"minecraft");
//		for(Student s: Main.getAllStudents()){
//			if(s instanceof Hacker){
//				fourChan.add((Hacker)s);
//			}
//		}
//		for(Student s: Main.getAllStudents()){
//			if(s instanceof NetworkAdministrator){
//				nwdm.add((NetworkAdministrator)s);
//			}
//		}
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
		for(Hacker s: fourChan){
			s.mutate();
		}
	}
//	public void shakeClubMember(){
//		for(Student s: Main.getAllStudents()){
//			if(s instanceof ClubMember && ((ClubMember) s).getClub().equals(getClub())){
//				shakeHandsWith(s);
//			}
//		}
//	}
}
