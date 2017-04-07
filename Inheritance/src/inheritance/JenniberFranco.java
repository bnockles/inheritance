package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class JenniberFranco extends ClubMember implements American{

	public JenniberFranco() {
		super("Jenniber","Franco",2017,Main.COMP_SCI_MAJOR,"k-drama");
	}
	
	public void act(){
		System.out.print("I am "+this.getFirstName()+".");
		shakeHandsClubMembers();
	}

	private void shakeHandsClubMembers() {
		System.out.print("I met ");
		ArrayList<Student> members = Main.getAllStudents();
		for(int i=0; i<members.size();i++){
			Student s = members.get(i);
			if(s!=this && (s instanceof ClubMember) && 
					((ClubMember) s).getClub().equals(this.getClub())){
				shakeHandsWith(s);
				System.out.print(s.getFirstName()+" "+s.getLastName()+", ");
			}
		}
	}
	
	public void run(){
		ArrayList<Student> members = Main.getAllStudents();
		for(int i = 0;i<members.size();i++){
			Student s = members.get(i);
			if(s instanceof Hacker){
				s.mutate();
				this.mutate();
			}
			else{
				s.corrupt();
			}
			if(i==members.size()-1){
				i--;
			}
		}
	}
	
	public void receiveMessage(Message message){
		ArrayList<Student> members = Main.getAllStudents();
		for(int i=0; i<members.size();i++){
			Student s = members.get(i);				
			if(s.getFirstName().equals("Ivan")){
				message.pass(this, s);
				break;
			}
		}
	}
}
